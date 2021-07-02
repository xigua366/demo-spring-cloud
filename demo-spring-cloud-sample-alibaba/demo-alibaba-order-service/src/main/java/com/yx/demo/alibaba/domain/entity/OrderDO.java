package com.yx.demo.alibaba.domain.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author xi.yang
 * @since 2021-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_order")
public class OrderDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
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

    private String remark;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
