package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Follows;
import com.sia.common.service.FollowsService;
import com.sia.common.mapper.FollowsMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【follows(关注表)】的数据库操作Service实现
* @createDate 2025-06-21 10:13:02
*/
@Service
public class FollowsServiceImpl extends ServiceImpl<FollowsMapper, Follows>
    implements FollowsService {

}




