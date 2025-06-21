package com.sia.common.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FollowDTO {
    private String id;           // 关注ID
    private String followerId;   // 关注者ID
    private String followedId;   // 被关注者ID
    private LocalDateTime createTime;     // 创建时间
    private LocalDateTime updateTime;     // 更新时间
}
