package com.yx.demo.ribbon;

import com.netflix.client.ClientFactory;
import com.netflix.client.http.HttpRequest;
import com.netflix.client.http.HttpResponse;
import com.netflix.config.ConfigurationManager;
import com.netflix.niws.client.http.RestClient;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
public class RibbonTest01 {

    public static void main(String[] args) throws Exception {

        ConfigurationManager.getConfigInstance().setProperty(
                "greeting-service.ribbon.listOfServers", "localhost:8080,localhost:8088");

        // 获取指定服务的RestClient，用于请求某个服务的client
        RestClient restClient = (RestClient) ClientFactory.getNamedClient("greeting-service");

        // 你要请求哪个接口，构造一个对应的HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri("/greeting/hello?name=leo")
                .build();

        // 模拟请求一个接口10次
        for(int i = 0; i < 10; i++) {
            HttpResponse response = restClient.executeWithLoadBalancer(request);
            String result = response.getEntity(String.class);
            System.out.println("第" + (i + 1) + "次请求：" + result);
        }

    }
}