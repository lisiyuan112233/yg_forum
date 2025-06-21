package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Likes;
import com.sia.common.service.LikesService;
import com.sia.common.mapper.LikesMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【likes(点赞表)】的数据库操作Service实现
* @createDate 2025-06-21 10:13:04
*/
@Service
public class LikesServiceImpl extends ServiceImpl<LikesMapper, Likes>
    implements LikesService{

}




