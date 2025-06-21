package com.sia.userservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.savedrequest.NullRequestCache;

@SpringBootApplication
@EnableWebSecurity
public class UserServiceApplication {

    @Autowired
    private JwtUtils jwtUtils;
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http,
                                                   AuthenticationConfiguration authConfig,
                                                   ObjectMapper objectMapper) throws Exception {
        http.anonymous(AbstractHttpConfigurer::disable).
                csrf(AbstractHttpConfigurer::disable).
                httpBasic(AbstractHttpConfigurer::disable).
                formLogin(AbstractHttpConfigurer::disable).
                logout(AbstractHttpConfigurer::disable).
                sessionManagement(AbstractHttpConfigurer::disable).

                requestCache(cache->{
                    cache.requestCache(new NullRequestCache());
                })
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .authorizeHttpRequests(authorize ->
                        authorize
                                .requestMatchers("/login").permitAll()
                                .anyRequest().authenticated() // 其他请求需要认证
                )
                .addFilterBefore(jsonUsernamePasswordFilter(authConfig.getAuthenticationManager(),objectMapper),
                        UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
    @Bean
    public JsonUsernamePasswordFilter jsonUsernamePasswordFilter(
            AuthenticationManager authenticationManager,ObjectMapper objectMapper) {
        JsonUsernamePasswordFilter passwordFilter = new JsonUsernamePasswordFilter(authenticationManager,objectMapper);
        passwordFilter.setAuthenticationSuccessHandler(new JsonAuthSuccessHandler(jwtUtils,objectMapper));
        passwordFilter.setAuthenticationFailureHandler(new JsonAuthFailureHandler(objectMapper));
        return passwordFilter;
    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        // 注册 JavaTimeModule 模块
        mapper.registerModule(new JavaTimeModule());
        // 禁用对日期时间的毫秒级序列化（可选）
        mapper.disable(com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return mapper;
    }

}
