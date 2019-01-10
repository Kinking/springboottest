/**
 * Title AccountServiceImpl
 * Package com.jerry.demo.service.impl
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 11:07 AM
 * @version V5.1.2
 */
package com.jerry.demo.service.impl;

import com.jerry.demo.bean.Account;
import com.jerry.demo.dao.IAccountDao;
import com.jerry.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户服务实现类
 * ClassName AccountServiceImpl
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 11:07 AM
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    IAccountDao accountDao;
    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }

    @Override
    public int update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDao.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAccountList();
    }
}