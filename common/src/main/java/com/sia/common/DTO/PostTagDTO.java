package com.sia.common.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostTagDTO {
    private String id;           // 关联ID
    private String postId;       // 帖子ID
    private String tagId;        // 标签ID
    private LocalDateTime createTime;     // 创建时间
}
