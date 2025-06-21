package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Favorites;
import com.sia.common.service.FavoritesService;
import com.sia.common.mapper.FavoritesMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【favorites(收藏表)】的数据库操作Service实现
* @createDate 2025-06-21 10:12:59
*/
@Service
public class FavoritesServiceImpl extends ServiceImpl<FavoritesMapper, Favorites>
    implements FavoritesService{

}




