package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Categories;
import com.sia.common.service.CategoriesService;
import com.sia.common.mapper.CategoriesMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【categories(分类表)】的数据库操作Service实现
* @createDate 2025-06-21 10:12:51
*/
@Service
public class CategoriesServiceImpl extends ServiceImpl<CategoriesMapper, Categories>
    implements CategoriesService{

}




