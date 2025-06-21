package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Configs;
import com.sia.common.service.ConfigsService;
import com.sia.common.mapper.ConfigsMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【configs(系统配置表)】的数据库操作Service实现
* @createDate 2025-06-21 10:12:57
*/
@Service
public class ConfigsServiceImpl extends ServiceImpl<ConfigsMapper, Configs>
    implements ConfigsService{

}




