package com.sia.common.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoryDTO {
    private String id;           // 分类ID
    private String name;         // 分类名称
    private String description;  // 分类描述
    private String parentId;     // 父分类ID
    private Integer sort;        // 排序值
    private Integer status;      // 状态：0=禁用，1=正常
    private LocalDateTime createTime;     // 创建时间
    private LocalDateTime updateTime;     // 更新时间
}
