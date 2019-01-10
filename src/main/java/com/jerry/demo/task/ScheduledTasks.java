/**
 * Title ScheduledTasks
 * Package com.jerry.demo.task
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/10 4:49 PM
 * @version V5.1.2
 */
package com.jerry.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * demo定时任务类
 * ClassName ScheduledTasks
 * @author huangzy21120@hundsun.com
 * @date 2019/1/10 4:49 PM
 */
@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

}