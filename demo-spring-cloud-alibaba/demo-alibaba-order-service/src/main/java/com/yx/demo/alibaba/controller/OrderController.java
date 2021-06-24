package com.yx.demo.alibaba.controller;

import com.yx.demo.alibaba.domain.dto.OrderDTO;
import com.yx.demo.alibaba.domain.dto.VideoDTO;
import com.yx.demo.alibaba.domain.request.CreateOrderRequest;
import com.yx.demo.alibaba.feign.VideoFeignClient;
import com.yx.demo.alibaba.service.OrderService;
import com.yx.demo.alibaba.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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

    @Autowired
    private OrderService orderService;


    /**
     * 购买视频，新增一个订单
     * @param createOrderRequest
     * @return
     */
    @PostMapping("/crateOrder")
    public JsonData crateOrder(@RequestBody CreateOrderRequest createOrderRequest) {

        //Video video = restTemplate.getForObject("http://localhost:9000/api/v1/video/find_by_id?videoId="+videoId, Video.class);

        //List<ServiceInstance> list =  discoveryClient.getInstances("demo-alibaba-video-service");

        //ServiceInstance serviceInstance = list.get(0);

        //Video video = restTemplate.getForObject("http://demo-alibaba-video-service/api/v1/video/find_by_id?videoId="+videoId, Video.class);

        Long videoId = createOrderRequest.getVideoId();

        VideoDTO videoDTO = videoFeignClient.findById(videoId);

//        OrderVO orderVO = new OrderVO();
//        orderVO.setVideoId(videoDTO.getId());
//        orderVO.setCreateTime(new Date());
//        orderVO.setVideoTitle(videoTitle);
//        orderVO.setUserId(createOrderRequest.getUserId());
//        orderVO.setServerInfo(videoDTO.getServerInfo());

        OrderDTO orderDTO = orderService.createOrder(createOrderRequest, videoDTO);
        orderDTO.setServerInfo(videoDTO.getServerInfo());

        return JsonData.buildSuccess(orderDTO);

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
