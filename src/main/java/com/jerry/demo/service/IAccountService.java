/**
 * Title IAccountService
 * Package com.jerry.demo.service
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 11:04 AM
 * @version V5.1.2
 */
package com.jerry.demo.service;

import com.jerry.demo.bean.Account;

import java.util.List;

/**
 * 账户服务
 * ClassName IAccountService
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 11:04 AM
 */
public interface IAccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
