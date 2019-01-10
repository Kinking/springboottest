/**
 * Title AccountDaoImpl
 * Package com.jerry.demo.dao.impl
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 10:09 AM
 * @version V5.1.2
 */
package com.jerry.demo.dao.impl;

import com.jerry.demo.bean.Account;
import com.jerry.demo.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Accout接口实现
 * ClassName AccountDaoImpl
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 10:09 AM
 */
@Repository
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into account(name, money) values(?, ?)", account.getName(), account.getMoney());
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("update account set name=? ,money=? where id=?", account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from table account where id = ?", id);
    }

    @Override
    public Account findAccountById(int id) {
        List<Account> list = jdbcTemplate.query("select * from account where id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Account.class));
        if(list != null && list.size()>0){
            Account account = list.get(0);
            return account;
        }else {
            return null;
        }
    }

    @Override
    public List<Account> findAccountList() {
        List<Account> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper<>(Account.class));
        if(list != null && list.size()>0){
            return list;
        }else {
            return null;
        }
    }
}