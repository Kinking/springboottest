/**
 * Title SpringbootRedisApplicationTests
 * Package com.jerry.demo.test
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:07 PM
 * @version V5.1.2
 */
package com.jerry.demo.test;

import com.jerry.demo.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * redis测试
 * ClassName SpringbootRedisApplicationTests
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:07 PM
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    public static Logger logger= LoggerFactory.getLogger(SpringbootRedisApplicationTests.class);

    @Test
    public void contextLoads() {
    }

    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis(){
        redisDao.setKey("name","forezp");
        redisDao.setKey("age","11");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
    }

}