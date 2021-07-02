package com.yx.demo.alibaba.service;


import com.yx.demo.alibaba.domain.dto.VideoDTO;
import com.yx.demo.alibaba.domain.entity.VideoDO;
import com.yx.demo.alibaba.domain.request.VideoRequest;

import java.math.BigDecimal;

/**
 * @author yangxi
 */
public interface VideoService {

    VideoDO createVideo(VideoRequest request);

    VideoDTO findById(Long videoId);

    boolean updatePoint(Long videoId, BigDecimal point);
}
