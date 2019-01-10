/**
 * Title AccountService
 * Package com.jerry.demo.service
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/4 9:59 AM
 * @version V5.1.2
 */
package com.jerry.demo.service;

import com.jerry.demo.bean.Account;
import com.jerry.demo.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * mybatis访问数据库服务
 * ClassName AccountService
 * @author huangzy21120@hundsun.com
 * @date 2019/1/4 9:59 AM
 */
@Service
public class AccountService implements AccountMapper{

    @Autowired
    private AccountMapper accountMapper;

    public int add(String name, double money) {
        return accountMapper.add(name, money);
    }
    public int update(String name, double money, int id) {
        return accountMapper.update(name, money, id);
    }
    public int delete(int id) {
        return accountMapper.delete(id);
    }
    public Account findAccount(int id) {
        return accountMapper.findAccount(id);
    }
    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }

}