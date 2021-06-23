package com.yx.demo.alibaba.service.impl;

import com.yx.demo.alibaba.dao.UserDAO;
import com.yx.demo.alibaba.domain.UserDO;
import com.yx.demo.alibaba.request.UserRequest;
import com.yx.demo.alibaba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDO getUserById(Long id) {
        return userDAO.getById(id);
    }

    @Override
    public void addUser(UserRequest userRequest) {
        UserDO userDO = new UserDO();
        userDO.setUsername(userRequest.getUsername());
        userDO.setPwd(userRequest.getPwd());
        userDO.setSecret(userRequest.getSecret());
        userDO.setRealName(userRequest.getRealName());
        userDO.setPhone(userRequest.getPhone());
        userDO.setTel(userRequest.getTel());
        userDO.setEmail(userRequest.getEmail());
        userDAO.save(userDO);
    }
}