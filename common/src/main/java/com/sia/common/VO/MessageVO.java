package com.sia.common.VO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageVO {
    private String id;           // 消息ID
    private UserVO sender;       // 发送者信息
    private UserVO receiver;     // 接收者信息
    private String content;      // 消息内容
    private Integer isRead;      // 是否已读
    private LocalDateTime createTime;     // 创建时间
}
