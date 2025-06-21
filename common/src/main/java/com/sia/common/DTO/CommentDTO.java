package com.sia.common.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDTO {
    private String id;           // 评论ID
    private String content;      // 评论内容
    private String userId;       // 评论用户ID
    private String postId;       // 帖子ID
    private String parentId;     // 父评论ID
    private String replyTo;      // 回复的用户ID
    private Integer status;      // 状态
    private LocalDateTime createTime;     // 创建时间
    private LocalDateTime updateTime;     // 更新时间
}
