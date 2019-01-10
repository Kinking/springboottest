/**
 * Title IAccountDao
 * Package com.jerry.demo.dao
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 10:07 AM
 * @version V5.1.2
 */
package com.jerry.demo.dao;

import com.jerry.demo.bean.Account;

import java.util.List;

/**
 * 涉及账户dao接口
 * ClassName IAccountDao
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 10:07 AM
 */
public interface IAccountDao {

    int add(Account account);

    int update(Account account);

    int delete(int i);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
