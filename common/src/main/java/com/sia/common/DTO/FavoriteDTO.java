package com.sia.common.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FavoriteDTO {
    private String id;           // 收藏ID
    private String userId;       // 收藏用户ID
    private String postId;       // 帖子ID
    private LocalDateTime createTime;     // 创建时间
}