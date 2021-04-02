package com.yx.demo.alibaba.controller;

import com.yx.demo.alibaba.domain.Video;
import com.yx.demo.alibaba.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yangxi
 */
@RestController
@RequestMapping("api/v1/video")
public class VideoController {



    @Autowired
    private VideoService videoService;


    @RequestMapping("find_by_id")
    public Object findById(int videoId, HttpServletRequest request){
        Video video = videoService.findById(videoId);

        //方便发现请求是哪台机器
        video.setServeInfo(request.getServerName()+":" +request.getServerPort());

        return video;
    }


    @PostMapping("save")
    public int save(@RequestBody  Video video){

        System.out.println(video.getTitle());

        return 1;
    }




}
