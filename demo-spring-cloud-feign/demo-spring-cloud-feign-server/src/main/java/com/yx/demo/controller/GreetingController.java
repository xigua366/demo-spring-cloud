package com.yx.demo.controller;

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
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/hello")
    public String hello(String name) {
        System.out.println("hello," + name);
        return "hello," + name;
    }

}