package com.yx.demo.alibaba.feign.fallback;

import com.yx.demo.alibaba.domain.dto.VideoDTO;
import com.yx.demo.alibaba.domain.request.UpdatePointRequest;
import com.yx.demo.alibaba.feign.VideoFeignClient;
import org.springframework.stereotype.Service;

/**
 * @author yangxi
 */
@Service
public class VideoFeignClientFallback implements VideoFeignClient {

    @Override
    public VideoDTO findById(Long videoId) {

        VideoDTO video = new VideoDTO();
        video.setTitle("这个是Fallback里面的视频");

        return video;
    }

    @Override
    public boolean updatePoint(UpdatePointRequest videoRequest) {
        return false;
    }
}
