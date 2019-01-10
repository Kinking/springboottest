/**
 * Title SimpleBookRepository
 * Package com.jerry.demo.dao.impl
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:41 PM
 * @version V5.1.2
 */
package com.jerry.demo.dao.impl;

import com.jerry.demo.bean.Book;
import com.jerry.demo.dao.BookRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * 书访问类实现
 * ClassName SimpleBookRepository
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:41 PM
 */
@Component
public class SimpleBookRepository implements BookRepository {
    @Override
    @Cacheable("books")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "Some book");
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}