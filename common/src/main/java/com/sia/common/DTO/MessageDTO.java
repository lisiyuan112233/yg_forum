package com.sia.common.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageDTO {
    private String id;           // 消息ID
    private String senderId;     // 发送者ID
    private String receiverId;   // 接收者ID
    private String content;      // 消息内容
    private Integer isRead;      // 是否已读
    private LocalDateTime createTime;     // 创建时间
}
