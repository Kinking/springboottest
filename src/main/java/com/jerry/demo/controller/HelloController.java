/**
 * Title HelloController
 * Package com.jerry.demo.controller
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/21 2:40 PM
 * @version V5.1.2
 */
package com.jerry.demo.controller;

import com.jerry.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制类
 * ClassName HelloController
 * @author huangzy21120@hundsun.com
 * @date 2018/12/21 2:40 PM
 */

@RestController
public class HelloController {

    /**
     *     @Value("${name}")
     *     private String name;
     *
     *     @Value("${hobby}")
     *     private String hobby;
     *
     *     @Value("${age}")
     *     private String age;
     */

    @Autowired
    private Person person;

    @RequestMapping(value = "/hello_china", method = RequestMethod.GET)
    public String say(){
        return  person.getName() + " is " + person.getAge() + " years old, and he " + " likes playing " + person.getHobby() ;
    }

    @RequestMapping(value = "/hello/{content}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("content") String content){
        return  content.toString() ;
    }

}