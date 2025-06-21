package com.sia.common.VO;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReportVO {
    private String id;           // 举报ID
    private UserVO user;         // 举报用户信息
    private UserVO handler;      // 处理人信息
    private String targetId;     // 被举报内容ID
    private Integer targetType;  // 内容类型
    private String reason;       // 举报原因
    private String description;  // 详细描述
    private Integer status;      // 处理状态
    private LocalDateTime handledAt;      // 处理时间
    private LocalDateTime createTime;     // 创建时间
    private LocalDateTime updateTime;     // 更新时间
}
