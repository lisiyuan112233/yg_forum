package com.sia.common.VO;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PostVO {
    private String id;              // 帖子ID
    private String title;           // 帖子标题
    private String content;         // 帖子内容
    private UserVO user;            // 发帖用户信息
    private CategoryVO category;    // 分类信息
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
    private List<TagVO> tags;       // 标签列表（扩展字段）
    private Boolean isLiked;        // 是否已点赞（扩展字段）
    private Boolean isFavorited;    // 是否已收藏（扩展字段）
}