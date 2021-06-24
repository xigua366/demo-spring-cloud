package com.yx.demo.alibaba.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class VideoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String title;

    private String summary;

    private String coverImg;

    private Integer  price;

    private BigDecimal point;

    private Date createTime;

    /**
     * 服务器信息
     */
    private String serverInfo;


}