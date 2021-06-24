package com.yx.demo.alibaba.service;

import com.yx.demo.alibaba.domain.dto.OrderDTO;
import com.yx.demo.alibaba.domain.dto.VideoDTO;
import com.yx.demo.alibaba.domain.request.CreateOrderRequest;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
public interface OrderService {

    /**
     * 新增订单
     * @param request
     * @return
     */
    OrderDTO createOrder(CreateOrderRequest request, VideoDTO videoDTO);

}