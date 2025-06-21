package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Messages;
import com.sia.common.service.MessagesService;
import com.sia.common.mapper.MessagesMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【messages(私信表)】的数据库操作Service实现
* @createDate 2025-06-21 10:13:07
*/
@Service
public class MessagesServiceImpl extends ServiceImpl<MessagesMapper, Messages>
    implements MessagesService{

}




