package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Tags;
import com.sia.common.service.TagsService;
import com.sia.common.mapper.TagsMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【tags(标签表)】的数据库操作Service实现
* @createDate 2025-06-21 10:13:20
*/
@Service
public class TagsServiceImpl extends ServiceImpl<TagsMapper, Tags>
    implements TagsService {

}




