package com.yx.demo.alibaba.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@Data
public class OrderVO implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 订单唯一标识
     */
    private String outTradeNo;

    /**
     * 0表示未支付，1表示已支付
     */
    private Integer state;

    /**
     * 支付金额，单位分
     */
    private Integer totalFee;

    /**
     * 视频主键
     */
    private Long videoId;

    /**
     * 视频标题
     */
    private String videoTitle;

    /**
     * 视频图片
     */
    private String videoImg;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;


    /**
     * 服务器信息
     */
    private String serverInfo;
}