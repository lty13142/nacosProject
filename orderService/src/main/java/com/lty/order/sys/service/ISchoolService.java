package com.lty.order.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lty.commons.School;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Tianyu
 * @since 2022-09-19
 */
public interface ISchoolService extends IService<School> {

    School getByid(String id);

}
