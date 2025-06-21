package com.sia.common.DTO;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AttachmentDTO {
    private String id;           // 附件ID
    private String userId;       // 上传用户ID
    private String postId;       // 关联帖子ID
    private String commentId;    // 关联评论ID
    private String filePath;     // 文件路径
    private String fileName;     // 原文件名
    private Long fileSize;       // 文件大小（字节）
    private String fileType;     // 文件类型
    private LocalDateTime createTime;     // 创建时间
}