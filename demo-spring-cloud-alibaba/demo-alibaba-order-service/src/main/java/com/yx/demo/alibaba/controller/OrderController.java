package com.yx.demo.alibaba.controller;

import com.yx.demo.alibaba.feign.VideoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangxi
 */
@RestController
@RequestMapping("api/v1/video_order")
@RefreshScope
public class OrderController {


//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Autowired
    private VideoFeignClient videoFeignClient;



    @Value("${video.title}")
    private String videoTitle;


    @RequestMapping("save")
    public Object save(int videoId){

        //Video video = restTemplate.getForObject("http://localhost:9000/api/v1/video/find_by_id?videoId="+videoId, Video.class);

        //List<ServiceInstance> list =  discoveryClient.getInstances("demo-alibaba-video-service");

        //ServiceInstance serviceInstance = list.get(0);

        //Video video = restTemplate.getForObject("http://demo-alibaba-video-service/api/v1/video/find_by_id?videoId="+videoId, Video.class);

        Video video = videoFeignClient.findById(videoId);

        VideoOrder videoOrder = new VideoOrder();
        videoOrder.setVideoId(video.getId());
        videoOrder.setCreateTime(new Date());
        videoOrder.setVideoTitle(videoTitle);

        videoOrder.setServerInfo(video.getServeInfo());
        return videoOrder;

    }


    /**
     * 测试 feign 调用 使用post方式传输对象
     * @param video
     * @return
     */
//    @RequestMapping("save")
//    public Object save(@RequestBody Video video){
//
//       Integer rows =  videoService.save(video);
//
//       Map<String,Object> map  = new HashMap<>();
//
//       map.put("rows",rows);
//
//       return map;
//    }


    int temp = 0;

    @RequestMapping("list")
    public Object list(HttpServletRequest request){

//
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        temp++;
        if(temp%3 == 0){
           // throw  new RuntimeException();
        }

        Map<String,String> map  = new HashMap<>();

        map.put("title1","test1");
        map.put("title2","test2");
        map.put("port",request.getServerPort()+"");

        return map;
    }






}
