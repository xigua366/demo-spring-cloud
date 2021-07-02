package com.yx.demo.controller;

import com.yx.demo.feign.GreetingFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@RestController
@RequestMapping("/test")
public class FeignClientController {

    @Autowired
    private GreetingFeignClient greetingFeignClient;

    @GetMapping("/hello")
    public String greeting(String name) {
       return greetingFeignClient.hello(name);
    }

}