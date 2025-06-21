package com.sia.common.VO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TagVO {
    private String id;           // 标签ID
    private String name;         // 标签名称
    private Integer count;       // 使用次数
    private LocalDateTime createTime;     // 创建时间
    private LocalDateTime updateTime;     // 更新时间
}
