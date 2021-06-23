package com.yx.demo.alibaba.controller;

import com.yx.demo.alibaba.domain.UserDO;
import com.yx.demo.alibaba.request.UserRequest;
import com.yx.demo.alibaba.service.UserService;
import com.yx.demo.alibaba.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public JsonData getUserById(@PathVariable("id") Long id) {
        UserDO userDO = userService.getUserById(id);
        return JsonData.buildSuccess(userDO);
    }

    @PostMapping
    public JsonData addUser(@RequestBody UserRequest userRequest) {
        userService.addUser(userRequest);
        return JsonData.buildSuccess(userRequest);
    }
}