package com.yx.demo.alibaba.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.demo.alibaba.domain.entity.OrderDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author xi.yang
 * @since 2021-06-24
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderDO> {

}
