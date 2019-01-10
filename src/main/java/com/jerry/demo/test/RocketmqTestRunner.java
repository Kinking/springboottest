/**
 * Title RocketmqTestRunner
 * Package com.jerry.demo.test
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 3:25 PM
 * @version V5.1.2
 */
package com.jerry.demo.test;

import com.jerry.demo.DemoApplication;
import com.jerry.demo.bean.Receiver;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * rocketmq测试
 * ClassName RocketmqTestRunner
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 3:25 PM
 */
@Component
public class RocketmqTestRunner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;
    private final Receiver receiver;
    private final ConfigurableApplicationContext context;

    public RocketmqTestRunner(RabbitTemplate rabbitTemplate, Receiver receiver, ConfigurableApplicationContext context) {
        this.rabbitTemplate = rabbitTemplate;
        this.receiver = receiver;
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend("spring-boot", "Hello from RabbitMQ!");
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
        context.close();

    }
}