package com.sia.common.VO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserVO {
    private String id;          // 用户ID
    private String username;    // 用户名
    private String email;       // 邮箱
    private String avatar;      // 头像路径
    private String signature;   // 个性签名
    private Integer role;       // 用户角色
    private Integer status;     // 用户状态
    private LocalDateTime createTime;    // 创建时间
    // 不包含密码字段，保障安全
}
