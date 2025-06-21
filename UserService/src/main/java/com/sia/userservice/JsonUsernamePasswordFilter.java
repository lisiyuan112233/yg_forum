package com.sia.userservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import java.io.IOException;
import java.util.Map;

public class JsonUsernamePasswordFilter extends AbstractAuthenticationProcessingFilter {

    public static final String LOGIN_URL = "/login";
    public static final String METHOD = "POST";

    private final ObjectMapper objectMapper;

    public JsonUsernamePasswordFilter(AuthenticationManager authenticationManager, ObjectMapper objectMapper) {
        super(new AntPathRequestMatcher(LOGIN_URL, METHOD), authenticationManager);
        this.objectMapper = objectMapper;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response)
            throws AuthenticationException, IOException {
        // 检查请求 Content-Type
        if (!"application/json".equalsIgnoreCase(request.getContentType())) {
            throw new AuthenticationServiceException("Authentication method not supported: " + request.getContentType());
        }

        // 从 JSON 请求体中提取用户名和密码
        Map<String, String> credentials = objectMapper.readValue(request.getInputStream(), Map.class);
        String username = credentials.getOrDefault("username", "");
        String password = credentials.getOrDefault("password", "");

        // 创建认证令牌
        UsernamePasswordAuthenticationToken authRequest =
                new UsernamePasswordAuthenticationToken(username, password);

        // 设置请求详情
        setDetails(request, authRequest);

        // 提交认证
        return this.getAuthenticationManager().authenticate(authRequest);
    }

    protected void setDetails(HttpServletRequest request,
                              UsernamePasswordAuthenticationToken authRequest) {
        authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
    }
}
