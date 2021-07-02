package com.yx;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import org.springframework.cloud.netflix.ribbon.StaticServerList;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
//@Configuration
public class DefaultServiceConfig {

    @Bean
    public ServerList<Server> ribbonServerList() {

        Server server1 = new Server("localhost", 8083);
//        Server server2 = new Server("localhost", 8088);

        StaticServerList<Server> serverList = new StaticServerList<>(server1);


        return serverList;
    }


}