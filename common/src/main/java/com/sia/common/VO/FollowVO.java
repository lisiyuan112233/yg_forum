package com.sia.common.VO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FollowVO {
    private String id;           // 关注ID
    private UserVO follower;     // 关注者信息
    private UserVO followed;     // 被关注者信息
    private LocalDateTime createTime;     // 创建时间
    private LocalDateTime updateTime;     // 更新时间
}