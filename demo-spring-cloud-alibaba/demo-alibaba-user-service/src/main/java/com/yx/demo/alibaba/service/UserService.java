package com.yx.demo.alibaba.service;

import com.yx.demo.alibaba.domain.UserDO;
import com.yx.demo.alibaba.request.UserRequest;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
public interface UserService {

    UserDO getUserById(Long id);

    void addUser(UserRequest userRequest);

}