package com.sia.common.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LikeDTO {
    private String id;           // 点赞ID
    private String userId;       // 点赞用户ID
    private String targetId;     // 被点赞内容ID
    private Integer targetType;  // 内容类型：1=帖子，2=评论
    private LocalDateTime createTime;     // 创建时间
}
