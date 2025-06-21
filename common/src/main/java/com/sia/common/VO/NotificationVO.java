package com.sia.common.VO;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotificationVO {
    private String id;           // 通知ID
    private UserVO user;         // 接收通知的用户信息
    private Integer type;        // 通知类型
    private String content;      // 通知内容
    private String targetId;     // 关联内容ID
    private Integer isRead;      // 是否已读
    private LocalDateTime createTime;     // 创建时间
}
