package com.lty.user.sys.mapper;

import com.lty.user.sys.entity.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lty.user.sys.vo.PersonVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Tianyu
 * @since 2022-09-23
 */
public interface PersonMapper extends BaseMapper<Person> {

    PersonVo getPersonById(String id);

}
