package com.sia.common.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostDTO {
    private String id;              // 帖子ID
    private String title;           // 帖子标题
    private String content;         // 帖子内容
    private String userId;          // 发帖用户ID
    private String categoryId;      // 分类ID
    private Integer viewCount;      // 浏览量
    private Integer replyCount;     // 回复数
    private Integer likeCount;      // 点赞数
    private Integer favoriteCount;  // 收藏数
    private Integer isTop;          // 是否置顶
    private Integer isLocked;       // 是否锁定
    private Integer isEssence;      // 是否精华
    private Integer status;         // 状态
    private LocalDateTime createTime;        // 创建时间
    private LocalDateTime updateTime;        // 更新时间
}