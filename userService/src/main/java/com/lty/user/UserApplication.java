package com.lty.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import com.lty.fien.clients.UserClient;

/**
 * @author Tianyu
 * @date 2022/9/19 16:02
 */
@SpringBootApplication
//方式1：
@EnableFeignClients(clients = {UserClient.class})
//方式2：
//@EnableFeignClients(basePackages = "com.lty.fien.clients")
@EnableDiscoveryClient
@MapperScan("com.lty.user.sys.mapper")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }


}
