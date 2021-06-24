package com.yx.demo.alibaba.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yx.demo.alibaba.dao.OrderDAO;
import com.yx.demo.alibaba.domain.entity.OrderDO;
import com.yx.demo.alibaba.mapper.OrderMapper;
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
public class OrderDAOImpl extends ServiceImpl<OrderMapper, OrderDO> implements OrderDAO {



}