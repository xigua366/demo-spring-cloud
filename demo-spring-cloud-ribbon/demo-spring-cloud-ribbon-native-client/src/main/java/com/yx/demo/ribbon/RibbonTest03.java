package com.yx.demo.ribbon;

import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */
public class RibbonTest03 {

    public static void main(String[] args) {

        BaseLoadBalancer balancer = new BaseLoadBalancer();
        balancer.setRule(new MyRule(balancer));

        List<Server> servers = new ArrayList<>();
        servers.add(new Server("localhost", 8080));
        servers.add(new Server("localhost", 8088));
        balancer.addServers(servers);

        for(int i = 0; i < 10; i++) {
            Server server = balancer.chooseServer(null);
            System.out.println(server);
        }


    }

}