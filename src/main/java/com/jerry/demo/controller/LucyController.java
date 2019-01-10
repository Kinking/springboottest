/**
 * Title LucyController
 * Package com.jerry.demo.controller
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 9:33 AM
 * @version V5.1.2
 */
package com.jerry.demo.controller;

import com.jerry.demo.bean.ConfigBean;
import com.jerry.demo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot测试控制类
 * ClassName LucyController
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 9:33 AM
 */
@RestController
//@EnableConfigurationProperties({ConfigBean.class})
@EnableConfigurationProperties({User.class})
public class LucyController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/lucy")
    public String miya(){
        return configBean.getGreeting() + ">>>" + configBean.getName() + ">>>" + configBean.getUuid() + ">>>" + configBean.getMax();
    }

    @Autowired
    User user;

    @RequestMapping(value = "/user")
    public String User(){
        return user.getName() + user.getAge();
    }

}