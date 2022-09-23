package com.lty.fien.clients;

import com.lty.commons.School;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Tianyu
 * @date 2022/9/23 16:37
 */
@FeignClient("orderService")
public interface UserClient {

    @GetMapping("/sys/school/getByid")
    School getByid(@RequestParam("id") String id);

}
