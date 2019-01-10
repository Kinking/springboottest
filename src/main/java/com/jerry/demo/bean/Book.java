/**
 * Title Book
 * Package com.jerry.demo.bean
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:40 PM
 * @version V5.1.2
 */
package com.jerry.demo.bean;

import java.io.Serializable;

/**
 * 书类
 * ClassName Book
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:40 PM
 */
public class Book implements Serializable {

    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}