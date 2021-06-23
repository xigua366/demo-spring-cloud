package com.yx.demo.alibaba.feign.fallback;

import com.yx.demo.alibaba.feign.VideoFeignClient;
import org.springframework.stereotype.Service;

/**
 * @author yangxi
 */
@Service
public class VideoFeignClientFallback implements VideoFeignClient {

    @Override
    public Video findById(int videoId) {

        Video video = new Video();
        video.setTitle("这个是Fallback里面的视频");

        return video;
    }

    @Override
    public int save(Video video) {
        return 0;
    }
}
