/**
 * Title Account
 * Package com.jerry.demo.bean
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 10:04 AM
 * @version V5.1.2
 */
package com.jerry.demo.bean;

/**
 * 账户类bean
 * ClassName Account
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 10:04 AM
 */
public class Account {
    private int id;
    private String name;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}