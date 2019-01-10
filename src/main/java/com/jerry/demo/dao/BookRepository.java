/**
 * Title BookRepository
 * Package com.jerry.demo.dao
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:41 PM
 * @version V5.1.2
 */
package com.jerry.demo.dao;

import com.jerry.demo.bean.Book;

/**
 * 书访问接口
 * ClassName BookRepository
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:41 PM
 */
public interface BookRepository {

    Book getByIsbn(String isbn);
}
