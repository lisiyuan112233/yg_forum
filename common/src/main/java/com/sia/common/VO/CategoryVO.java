package com.sia.common.VO;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CategoryVO {
    private String id;           // 分类ID
    private String name;         // 分类名称
    private String description;  // 分类描述
    private String parentId;     // 父分类ID
    private Integer sort;        // 排序值
    private Integer status;      // 状态
    private LocalDateTime createTime;     // 创建时间
    private List<CategoryVO> children;  // 子分类列表（用于树形结构）
}
