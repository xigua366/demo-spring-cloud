package com.yx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
public class RestTemplateController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(String name) {
        String url = "http://greeting-service/greeting/hello?name={name}";
        String result = restTemplate.getForObject(url, String.class, name);
        return result;
    }

}