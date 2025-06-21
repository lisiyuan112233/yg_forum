package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Notifications;
import com.sia.common.service.NotificationsService;
import com.sia.common.mapper.NotificationsMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【notifications(通知表)】的数据库操作Service实现
* @createDate 2025-06-21 10:13:10
*/
@Service
public class NotificationsServiceImpl extends ServiceImpl<NotificationsMapper, Notifications>
    implements NotificationsService {

}




