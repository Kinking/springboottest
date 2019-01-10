/**
 * Title AppRunner
 * Package com.jerry.demo.test
 * Copyright 2019 www.hundsun.com All Rights Reserved.
 *
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:43 PM
 * @version V5.1.2
 */
package com.jerry.demo.test;

import com.jerry.demo.dao.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * spring cache访问书类实现
 * ClassName AppRunner
 * @author huangzy21120@hundsun.com
 * @date 2019/1/6 2:43 PM
 */
@Component
public class SpringCacheTestRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringCacheTestRunner.class);

    private final BookRepository bookRepository;

    public SpringCacheTestRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        logger.info(".... Fetching books");
       // logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
       // logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
       // logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
       // logger.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
       // logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
       // logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
    }
}