package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.PostTags;
import com.sia.common.service.PostTagsService;
import com.sia.common.mapper.PostTagsMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【post_tags(标签关联表)】的数据库操作Service实现
* @createDate 2025-06-21 10:13:12
*/
@Service
public class PostTagsServiceImpl extends ServiceImpl<PostTagsMapper, PostTags>
    implements PostTagsService{

}




