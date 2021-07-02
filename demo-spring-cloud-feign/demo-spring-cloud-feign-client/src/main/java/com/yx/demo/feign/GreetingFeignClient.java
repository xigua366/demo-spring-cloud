package com.yx.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@FeignClient("greeting-service")
public interface GreetingFeignClient {

    @GetMapping("/greeting/hello")
    String hello(@RequestParam("name") String name);

}