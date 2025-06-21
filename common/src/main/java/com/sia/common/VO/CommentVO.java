package com.sia.common.VO;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CommentVO {
    private String id;           // 评论ID
    private String content;      // 评论内容
    private UserVO user;         // 评论用户信息
    private UserVO replyToUser;  // 回复的用户信息
    private Integer status;      // 状态
    private LocalDateTime createTime;     // 创建时间
    private LocalDateTime updateTime;     // 更新时间
    private List<CommentVO> replies;  // 子评论列表（用于层级结构）
}
