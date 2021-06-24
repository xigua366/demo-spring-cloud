package com.yx.demo.alibaba.domain.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author xi.yang
 * @since 2021-06-24
 */
@Data
public class VideoRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 描述
     */
    private String summary;

    /**
     * 视频图片
     */
    private String coverImg;

    /**
     * 视频价格
     */
    private Integer price;

    /**
     * 评分
     */
    private BigDecimal point;

}
