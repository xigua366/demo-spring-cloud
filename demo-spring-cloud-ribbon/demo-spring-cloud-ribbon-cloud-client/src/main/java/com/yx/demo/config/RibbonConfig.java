package com.yx.demo.config;

import com.yx.DefaultServiceConfig;
import com.yx.GreetingServiceConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * <p>
 *
 * </p>
 *
 * @author yangxi
 * @version 1.0
 */

// 思考1：为什么@RibbonClients的优先级最高呢？ 可能是RibbonClientConfigurationRegistrar.java组件中是先扫描@RibbonClients的缘故。 明天再debug下从SpringClientFactory中获取bean组件的逻辑

// 思考2：为什么没有配置@RibbonClient 跟 @RibbonClients 的时候（也就是SpringClientFactory中没有子ioc容器的时候），application.yml中的配置就会生效呢？


// 如果配置了@RibbonClient或@RibbonClients，那么application.yml中的 greeting-service.ribbon.xxx 配置就不生效了

// @RibbonClient中配置的组件优先级要比@RibbonClients的低
@RibbonClient(value = "greeting-service", configuration = GreetingServiceConfig.class)

// 经过测试发现@RibbonClients的优先级最高
@RibbonClients(defaultConfiguration = DefaultServiceConfig.class)
public class RibbonConfig {


}