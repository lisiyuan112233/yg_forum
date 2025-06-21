package com.sia.userservice;

import cn.hutool.core.bean.BeanUtil;
import com.sia.common.Contenst;
import com.sia.common.VO.UserVO;
import com.sia.common.entity.Users;
import com.sia.common.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

/**
 * 自定义密码验证提供者
 */
@Component
@AllArgsConstructor
public class PasswordAuthenticationProvider implements AuthenticationProvider {

    private final UsersService usersService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // 获取用户名和密码
        String username = authentication.getName();
        String rawPassword = (String) authentication.getCredentials();

        // 1. 加载用户信息
        UserDetails userDetails = null;
        Users user = usersService.lambdaQuery().eq(Users::getUsername, username).one();
        if (user == null) {
            throw new BadCredentialsException("用户不存在");
        }
        if (!Objects.equals(String.valueOf(user.getStatus()), Contenst.USER_STATUS_YES)){
            throw new DisabledException("账户已被禁用");
        }
        userDetails= User.builder()
                .password(user.getPassword())
                .username(user.getUsername())
                .authorities(String.valueOf(user.getRole()))
                .build();
        // 2. 验证密码
        if (!passwordEncoder.matches(rawPassword, userDetails.getPassword())) {
            throw new BadCredentialsException("密码错误");
        }

        // 3. 检查账户状态
        if (!userDetails.isAccountNonLocked()) {
            throw new LockedException("账户已被锁定");
        }
        if (!userDetails.isEnabled()) {
            throw new DisabledException("账户已被禁用");
        }
        if (!userDetails.isAccountNonExpired()) {
            throw new AccountExpiredException("账户已过期");
        }
        if (!userDetails.isCredentialsNonExpired()) {
            throw new CredentialsExpiredException("凭证已过期");
        }

        UserVO userVO = new UserVO();
        BeanUtil.copyProperties(user,userVO);
        // 4. 认证成功，创建已认证的 Authentication 对象
        return new myUsernamePasswordAuthenticationToken(
                userVO,
                userDetails,
                null,
                userDetails.getAuthorities()
        );
    }

    @Override
    public boolean supports(Class<?> authentication) {
        // 仅支持 UsernamePasswordAuthenticationToken 类型的认证
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}