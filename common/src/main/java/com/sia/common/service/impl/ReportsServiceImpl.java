package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Reports;
import com.sia.common.service.ReportsService;
import com.sia.common.mapper.ReportsMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【reports(举报表)】的数据库操作Service实现
* @createDate 2025-06-21 10:13:17
*/
@Service
public class ReportsServiceImpl extends ServiceImpl<ReportsMapper, Reports>
    implements ReportsService{

}




