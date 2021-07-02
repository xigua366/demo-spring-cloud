package com.yx.demo.alibaba.feign;

import com.yx.demo.alibaba.domain.dto.VideoDTO;
import com.yx.demo.alibaba.domain.request.UpdatePointRequest;
import com.yx.demo.alibaba.feign.fallback.VideoFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value = "demo-alibaba-video-service" , fallback = VideoFeignClientFallback.class)
public interface VideoFeignClient {

    @GetMapping("/api/v1/video/find_by_id")
    VideoDTO findById(@RequestParam("videoId") Long videoId);


    @PutMapping("/api/v1/video/update_point")
    boolean updatePoint(@RequestBody UpdatePointRequest videoRequest);

}
