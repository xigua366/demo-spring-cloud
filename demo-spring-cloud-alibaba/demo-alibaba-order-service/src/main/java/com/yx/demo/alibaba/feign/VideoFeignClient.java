package com.yx.demo.alibaba.feign;

import com.yx.demo.alibaba.feign.fallback.VideoFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "demo-alibaba-video-service" , fallback = VideoFeignClientFallback.class)
public interface VideoFeignClient {

    @GetMapping("/api/v1/video/find_by_id")
    Video findById(@RequestParam("videoId") int videoId);


    @PostMapping("/api/v1/video/save")
    int save(@RequestBody Video video);

}
