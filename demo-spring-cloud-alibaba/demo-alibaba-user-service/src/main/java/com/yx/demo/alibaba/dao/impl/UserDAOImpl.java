package com.yx.demo.alibaba.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yx.demo.alibaba.dao.UserDAO;
import com.yx.demo.alibaba.domain.UserDO;
import com.yx.demo.alibaba.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@Repository
public class UserDAOImpl extends ServiceImpl<UserMapper, UserDO> implements UserDAO {


}