package com.lty.order.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lty.commons.School;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Tianyu
 * @since 2022-09-19
 */
public interface SchoolMapper extends BaseMapper<School> {

    School getSchool(String id);

}
