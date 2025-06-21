package com.sia.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.common.entity.Attachments;
import com.sia.common.service.AttachmentsService;
import com.sia.common.mapper.AttachmentsMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【attachments(附件表)】的数据库操作Service实现
* @createDate 2025-06-21 10:11:32
*/
@Service
public class AttachmentsServiceImpl extends ServiceImpl<AttachmentsMapper, Attachments>
    implements AttachmentsService {

}




