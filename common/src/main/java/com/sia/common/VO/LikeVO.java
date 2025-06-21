package com.sia.common.VO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LikeVO {
    private String id;           // 点赞ID
    private UserVO user;         // 点赞用户信息
    private String targetId;     // 被点赞内容ID
    private Integer targetType;  // 内容类型
    private LocalDateTime createTime;     // 创建时间
}