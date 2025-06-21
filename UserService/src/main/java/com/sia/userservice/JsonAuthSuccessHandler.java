package com.sia.userservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.validation.annotation.Validated;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@Data
@AllArgsConstructor
public class JsonAuthSuccessHandler implements AuthenticationSuccessHandler {

    private JwtUtils jwtUtils;
    private final ObjectMapper objectMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication)
            throws IOException{
        // 从自定义认证令牌中获取用户数据
        myUsernamePasswordAuthenticationToken authToken =
                (myUsernamePasswordAuthenticationToken) authentication;
        Object userData = authToken.getData();

        // 创建JWT的claims，将用户数据放入data字段
        Map<String, Object> claims = new HashMap<>();
        claims.put("data", objectMapper.writeValueAsString(userData));

        // 生成JWT
        String jwtToken = jwtUtils.generateToken(claims);

        // 构建响应
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("code", 200);
        responseBody.put("message", "登录成功");
        responseBody.put("token", jwtToken); // 返回JWT

        // 写入响应
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding("UTF-8");
        response.setStatus(HttpServletResponse.SC_OK);
        objectMapper.writeValue(response.getWriter(), responseBody);
    }
}
