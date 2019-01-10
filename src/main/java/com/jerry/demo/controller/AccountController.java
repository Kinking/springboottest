/**
 * Title AccountController
 * Package com.jerry.demo.controller
 * Copyright 2018 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 11:08 AM
 * @version V5.1.2
 */
package com.jerry.demo.controller;

import com.jerry.demo.bean.Account;
import com.jerry.demo.service.AccountService;
import com.jerry.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 账户控制类
 * ClassName AccountController
 * @author huangzy21120@hundsun.com
 * @date 2018/12/24 11:08 AM
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    /******************传统方式**********************/
    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> getAccounts(){
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id){
        return accountService.findAccountById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id")int id , @RequestParam(value = "name",required = true)String name,
                                @RequestParam(value = "money", required = true)double money){
        Account account = new Account();
        account.setId(id);
        account.setMoney(money);
        account.setName(name);
        int t = accountService.update(account);
        if( t == 1 ){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name")String name,
                               @RequestParam(value = "money")double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        int t= accountService.add(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    /******************MyBatis方式**********************/
    @Autowired
    private AccountService mybatisAccountService;

    

}