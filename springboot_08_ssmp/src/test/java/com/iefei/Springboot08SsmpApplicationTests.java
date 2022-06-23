package com.iefei;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iefei.dao.StudentDao;
import com.iefei.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08SsmpApplicationTests {
    @Autowired
private StudentDao studentDao;
    @Test
    void contextLoads() {
        System.out.println(studentDao.selectById(4));
    }
    @Test
    void testSave() {
        Student student=new Student();
        student.setStuName("张老师");
        student.setStuAge(13);
        student.setStuPhone("15000000000");
        student.setStuGender("女");
        System.out.println(studentDao.insert(student));
    }
    @Test
    void testUpdate() {
        Student student=new Student();
        student.setStuId(5);
        student.setStuName("张老师");
        student.setStuAge(13);
        student.setStuPhone("15000000000");
        student.setStuGender("女");
        System.out.println(studentDao.updateById(student));
    }
    @Test
    void testDelete() {
        System.out.println(studentDao.deleteById(5));
    }
    @Test
    void testGetAll() {
        System.out.println(studentDao.selectList(null));
    }
    @Test
    void testGetPage() {
        IPage page=new Page(2,5);
        IPage page1 = studentDao.selectPage(page, null);
        System.out.println(page.getRecords());
    }

    @Test
    void testGetWhere() {
        QueryWrapper<Student> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("stu_name","老");
        System.out.println(studentDao.selectList(queryWrapper));
    }
    @Test
    void testGetWhere02() {
        String stuname="";
        LambdaQueryWrapper<Student> queryWrapper=new LambdaQueryWrapper<>();
//        queryWrapper.like(Student::getStuName,"老");
        queryWrapper.like(stuname!=null,Student::getStuName,stuname);
        System.out.println(studentDao.selectList(queryWrapper));
    }
}
