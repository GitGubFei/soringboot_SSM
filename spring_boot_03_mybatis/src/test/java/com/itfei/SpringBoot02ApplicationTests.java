package com.itfei;

import com.itfei.dao.StudentDao;
import com.itfei.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot02ApplicationTests {
//注入要测试的对象
    //执行要测试对象的方法
    @Autowired
    private StudentDao studentDao;
    @Test
    void contextLoads() {
        Student stu= studentDao.getStuById(4);
        System.out.println(stu+"sss");

    }

}
