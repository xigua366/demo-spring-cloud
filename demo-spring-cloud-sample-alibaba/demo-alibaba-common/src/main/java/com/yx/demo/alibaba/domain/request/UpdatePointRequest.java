package com.yx.demo.alibaba.domain.request;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
@Data
public class UpdatePointRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private BigDecimal point;

}