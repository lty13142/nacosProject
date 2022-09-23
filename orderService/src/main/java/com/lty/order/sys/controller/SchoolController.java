package com.lty.order.sys.controller;


import com.lty.commons.School;
import com.lty.order.sys.service.ISchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Tianyu
 * @since 2022-09-19
 */
@RestController
@RequestMapping("/sys/school")
public class SchoolController {

    @Autowired
    private ISchoolService schoolService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getByid")
    public School getByid(String id){
        System.out.println("服务器端口为：" + port);
        return schoolService.getByid(id);
    }


}

