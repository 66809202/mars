package com.wj.wjtest;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * springboot 启动类
 * @author jian.k.wang
 *
 */
@SpringBootApplication
@EnableAsync //，可以使用异步注解
public class WjtestApplication {
	
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("active.queue");
    }

	public static void main(String[] args) {
		SpringApplication.run(WjtestApplication.class, args);
	}

}
