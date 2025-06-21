package com.sia.userservice;

import lombok.Data;
import lombok.Getter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
@Getter
public class myUsernamePasswordAuthenticationToken extends UsernamePasswordAuthenticationToken {
    private final Object Data;
    public myUsernamePasswordAuthenticationToken(Object data,Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
        Data= data;
    }
}
