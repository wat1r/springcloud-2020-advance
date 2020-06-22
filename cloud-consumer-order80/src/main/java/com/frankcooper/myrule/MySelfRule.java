package com.frankcooper.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date 2020/6/22
 * @Author Frank Cooper
 * @Description
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule MySelfRule() {
        return new RandomRule();// 定义为随机
    }
}
