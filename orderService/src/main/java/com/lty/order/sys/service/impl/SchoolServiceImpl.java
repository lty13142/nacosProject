package com.lty.order.sys.service.impl;

import com.lty.commons.School;
import com.lty.order.sys.mapper.SchoolMapper;
import com.lty.order.sys.service.ISchoolService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Tianyu
 * @since 2022-09-19
 */
@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements ISchoolService {

    @Override
    public School getByid(String id) {
        return this.baseMapper.getSchool(id);
    }
}
