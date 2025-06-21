package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Posts;
import com.sia.common.service.PostsService;
import com.sia.common.mapper.PostsMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【posts(帖子表)】的数据库操作Service实现
* @createDate 2025-06-21 10:13:15
*/
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts>
    implements PostsService{

}




