package com.lty.user.sys.controller;


import com.lty.commons.School;
import com.lty.fien.clients.UserClient;
import com.lty.user.sys.service.IPersonService;
import com.lty.user.sys.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Tianyu
 * @since 2022-09-23
 */
@RestController
@RequestMapping("/sys/person")
public class PersonController {

    @Autowired
    private IPersonService iPersonService;

    @Autowired
    private UserClient userClient;

    @GetMapping("/getPersonVo")
    public PersonVo getPersonVo(String id){
        PersonVo person = iPersonService.getPerson(id);
        School school = userClient.getByid(person.getSchoolId().toString());
        person.setSchool(school);
        return person;
    }


}

