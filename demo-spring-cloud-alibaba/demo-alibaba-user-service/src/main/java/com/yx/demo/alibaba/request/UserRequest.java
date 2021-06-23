package com.yx.demo.alibaba.request;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@Data
public class UserRequest implements Serializable {

    /**
     * 用户名/员工工号
     */
    private String username;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 盐
     */
    private String secret;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 固定电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;
}