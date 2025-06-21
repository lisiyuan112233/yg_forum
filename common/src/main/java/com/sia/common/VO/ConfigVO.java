package com.sia.common.VO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ConfigVO {
    private String id;           // 配置ID
    private String key;          // 配置项名称
    private String value;        // 配置值
    private String description;  // 配置描述
    private LocalDateTime createTime;     // 创建时间
    private LocalDateTime updateTime;     // 更新时间
}
