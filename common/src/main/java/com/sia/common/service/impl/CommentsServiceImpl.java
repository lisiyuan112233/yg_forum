package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Comments;
import com.sia.common.service.CommentsService;
import com.sia.common.mapper.CommentsMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【comments(评论表)】的数据库操作Service实现
* @createDate 2025-06-21 10:12:54
*/
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments>
    implements CommentsService{

}




