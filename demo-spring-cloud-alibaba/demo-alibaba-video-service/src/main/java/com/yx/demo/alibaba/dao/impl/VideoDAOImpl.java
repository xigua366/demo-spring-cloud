package com.yx.demo.alibaba.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yx.demo.alibaba.dao.VideoDAO;
import com.yx.demo.alibaba.domain.entity.VideoDO;
import com.yx.demo.alibaba.mapper.VideoMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xi.yang
 * @since 2021-06-24
 */
@Repository
public class VideoDAOImpl extends ServiceImpl<VideoMapper, VideoDO> implements VideoDAO {

}
