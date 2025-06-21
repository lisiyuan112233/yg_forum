package com.sia.common.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDTO {
    private String id;          // 用户ID
    private String username;    // 用户名
    private String password;    // 加密密码
    private String email;       // 邮箱
    private String avatar;      // 头像路径
    private String signature;   // 个性签名
    private Integer role;       // 用户角色：0=普通用户，1=管理员，2=版主
    private Integer status;     // 用户状态：0=禁用，1=正常，2=待审核
    private LocalDateTime createTime;    // 创建时间
    private LocalDateTime updateTime;    // 更新时间
}
