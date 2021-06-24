package com.yx.demo.alibaba.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 创建订单请求数据组件
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@Data
public class CreateOrderRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 视频课程ID
     */
    private Long videoId;
}