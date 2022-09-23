package com.lty.user.sys.service;

import com.lty.user.sys.entity.Person;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lty.user.sys.vo.PersonVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Tianyu
 * @since 2022-09-23
 */
public interface IPersonService extends IService<Person> {

    PersonVo getPerson(String id);

}
