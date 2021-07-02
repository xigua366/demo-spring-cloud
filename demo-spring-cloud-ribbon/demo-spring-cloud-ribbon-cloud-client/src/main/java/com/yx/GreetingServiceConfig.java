package com.yx;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import org.springframework.cloud.netflix.ribbon.StaticServerList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
//@Configuration
public class GreetingServiceConfig {

    @Bean
    public ServerList<Server> ribbonServerList() {

        Server server1 = new Server("localhost", 8082);
//        Server server2 = new Server("localhost", 8088);

        StaticServerList<Server> serverList = new StaticServerList<>(server1);


        return serverList;
    }


}