package com.itfei;

import com.itfei.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot02ApplicationTests {
//注入要测试的对象
    //执行要测试对象的方法
    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        bookDao.save();
        System.out.println("ssss");
    }

}
