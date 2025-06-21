package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Users;
import com.sia.common.service.UsersService;
import com.sia.common.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【users(用户表)】的数据库操作Service实现
* @createDate 2025-06-21 10:13:23
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService {

}




