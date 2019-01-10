/**
 * Title AccountMapper
 * Package com.jerry.demo.dao
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/4 9:55 AM
 * @version V5.1.2
 */
package com.jerry.demo.dao;

import com.jerry.demo.bean.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * mybatis形式dao
 * ClassName AccountMapper
 * @author huangzy21120@hundsun.com
 * @date 2019/1/4 9:55 AM
 */
@Mapper
public interface AccountMapper {

    @Insert("insert into account(name, money) values(#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") double money);

    @Update("update account set name = #{name}, money = #{money} where id = #{id}")
    int update(@Param("name") String name, @Param("money") double money, @Param("id") int  id);

    @Delete("delete from account where id = #{id}")
    int delete(int id);

    @Select("select id, name as name, money as money from account where id = #{id}")
    Account findAccount(@Param("id") int id);

    @Select("select id, name as name, money as money from account")
    List<Account> findAccountList();
}
