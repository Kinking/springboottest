/**
 * Title User
 * Package com.jerry.demo.bean
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 9:42 AM
 * @version V5.1.2
 */
package com.jerry.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 用户类
 * ClassName User
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 9:42 AM
 */

@Configuration
@PropertySource(value="classpath:test.properties")
@ConfigurationProperties(prefix = "com.forezp")
public class User {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}