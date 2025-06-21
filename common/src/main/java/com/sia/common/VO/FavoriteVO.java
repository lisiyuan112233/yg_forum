package com.sia.common.VO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FavoriteVO {
    private String id;           // 收藏ID
    private UserVO user;         // 收藏用户信息
    private PostVO post;         // 收藏的帖子信息
    private LocalDateTime createTime;     // 创建时间
}
