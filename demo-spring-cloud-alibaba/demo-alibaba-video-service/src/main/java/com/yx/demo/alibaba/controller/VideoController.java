package com.yx.demo.alibaba.controller;

import com.yx.demo.alibaba.domain.dto.VideoDTO;
import com.yx.demo.alibaba.domain.entity.VideoDO;
import com.yx.demo.alibaba.domain.request.UpdatePointRequest;
import com.yx.demo.alibaba.domain.request.VideoRequest;
import com.yx.demo.alibaba.service.VideoService;
import com.yx.demo.alibaba.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yangxi
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {



    @Autowired
    private VideoService videoService;

    @PostMapping("/create")
    public JsonData createVideo(@RequestBody VideoRequest request){
        VideoDO videoDO = videoService.createVideo(request);

        return JsonData.buildSuccess(videoDO);
    }


    @RequestMapping("find_by_id")
    public VideoDTO findById(Long videoId, HttpServletRequest request){
        VideoDTO videoDTO = videoService.findById(videoId);

        //方便发现请求是哪台机器
        videoDTO.setServerInfo(request.getServerName()+":" + request.getServerPort());

        return videoDTO;
    }

    @PutMapping("/update_point")
    boolean updatePoint(@RequestBody UpdatePointRequest videoRequest) {
        return videoService.updatePoint(videoRequest.getId(), videoRequest.getPoint());
    }


}
