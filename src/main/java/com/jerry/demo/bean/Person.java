/**
 * Title Person
 * Package com.jerry.demo.bean
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/21 4:13 PM
 * @version V5.1.2
 */
package com.jerry.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * "人"对象
 * ClassName Person
 * @author huangzy21120@hundsun.com
 * @date 2018/12/21 4:13 PM
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;

    private String age;

    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}