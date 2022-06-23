package com.itfei;

import com.itfei.dao.StudentDao;
import com.itfei.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisPlusApplicationTests {
    @Autowired
    private StudentDao studentDao;
    @Test
    void contextLoads() {
        Student stu= studentDao.selectById(4);
        System.out.println(stu+"sss");
        System.out.println(studentDao.selectList(null));
    }
}
