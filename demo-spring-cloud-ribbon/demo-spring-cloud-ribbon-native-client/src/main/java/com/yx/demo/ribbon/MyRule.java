package com.yx.demo.ribbon;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * 自定义负载均衡选举规则
 */
public class MyRule implements IRule {

    private ILoadBalancer balancer;

    public MyRule() {

    }

    public MyRule(ILoadBalancer balancer) {
        this.balancer = balancer;
    }

    @Override
    public Server choose(Object key) {
        List<Server> servers = balancer.getAllServers();

        // 自定义规则选举，每次都返回服务列表的第一台机器
        return servers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        this.balancer = lb;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.balancer;
    }
}
