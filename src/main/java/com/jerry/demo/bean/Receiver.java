/**
 * Title Receiver
 * Package com.jerry.demo.bean
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 3:17 PM
 * @version V5.1.2
 */
package com.jerry.demo.bean;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * mq消息接受者
 * ClassName Receiver
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 3:17 PM
 * 消息接收者是一个简单的POJO类，它定义了一个方法去接收消息，当你注册它去接收消息，你可以给它取任何的名字。
 * 其中，它有CountDownLatch这样的一个类，它是用于告诉发送者消息已经收到了，你不需要在应用程序中具体实现它，只需要latch.countDown()就行了。
 */
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}