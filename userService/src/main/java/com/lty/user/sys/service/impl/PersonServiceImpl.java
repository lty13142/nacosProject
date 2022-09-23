package com.lty.user.sys.service.impl;

import com.lty.user.sys.entity.Person;
import com.lty.user.sys.mapper.PersonMapper;
import com.lty.user.sys.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lty.user.sys.vo.PersonVo;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Tianyu
 * @since 2022-09-23
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Override
    public PersonVo getPerson(String id) {
        return this.baseMapper.getPersonById(id);
    }
}
