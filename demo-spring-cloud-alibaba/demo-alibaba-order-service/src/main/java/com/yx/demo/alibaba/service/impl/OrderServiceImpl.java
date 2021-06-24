package com.yx.demo.alibaba.service.impl;

import com.yx.demo.alibaba.dao.OrderDAO;
import com.yx.demo.alibaba.domain.dto.OrderDTO;
import com.yx.demo.alibaba.domain.dto.VideoDTO;
import com.yx.demo.alibaba.domain.entity.OrderDO;
import com.yx.demo.alibaba.domain.request.CreateOrderRequest;
import com.yx.demo.alibaba.service.OrderService;
import com.yx.demo.alibaba.utils.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Transactional
    @Override
    public OrderDTO createOrder(CreateOrderRequest request, VideoDTO videoDTO) {

        // 组装订单对象
        OrderDO orderDO = createOrderDO(request, videoDTO);

        orderDAO.save(orderDO);

        return createOrderDTO(orderDO);
    }

    private OrderDO createOrderDO(CreateOrderRequest request, VideoDTO videoDTO) {
        OrderDO orderDO = new OrderDO();
        String outTradeNo = CommonUtil.generateUUID();
        orderDO.setOutTradeNo(outTradeNo);
        orderDO.setState(1);
        orderDO.setState(videoDTO.getPrice());
        orderDO.setVideoId(videoDTO.getId());
        orderDO.setVideoTitle(videoDTO.getTitle());
        orderDO.setVideoImg(videoDTO.getCoverImg());
        orderDO.setUserId(request.getUserId());
        return orderDO;
    }

    private OrderDTO createOrderDTO(OrderDO orderDO) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(orderDO.getId());
        orderDTO.setOutTradeNo(orderDO.getOutTradeNo());
        orderDTO.setState(orderDO.getState());
        orderDTO.setTotalFee(orderDO.getTotalFee());
        orderDTO.setVideoId(orderDO.getVideoId());
        orderDTO.setVideoTitle(orderDO.getVideoTitle());
        orderDTO.setVideoImg(orderDO.getVideoImg());
        orderDTO.setUserId(orderDO.getUserId());
        orderDTO.setRemark(orderDO.getRemark());
        orderDTO.setCreateTime(orderDO.getCreateTime());
        return orderDTO;
    }

}