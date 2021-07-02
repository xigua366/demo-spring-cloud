package com.yx.demo.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangxi
 */
@SpringBootApplication
@EnableDiscoveryClient
public class VideoApplication {

    public static void main(String [] args){

        SpringApplication.run(VideoApplication.class,args);
    }


}
