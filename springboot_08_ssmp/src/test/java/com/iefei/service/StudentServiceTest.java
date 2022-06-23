package com.iefei.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iefei.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private  IStudentService studentService;
    @Test
    void testGetById(){
        System.out.println(studentService.getById(4)); ;

    }
//    @Test
//    void testSave() {
//        Student student=new Student();
//        student.setStuName("张老师");
//        student.setStuAge(13);
//        student.setStuPhone("15000000000");
//        student.setStuGender("女");
//        System.out.println(studentService.save(student));
//    }
//    @Test
//    void testUpdate() {
//        Student student=new Student();
//        student.setStuId(5);
//        student.setStuName("张老师");
//        student.setStuAge(13);
//        student.setStuPhone("15000000000");
//        student.setStuGender("女");
//        System.out.println(studentService.update(student));
//    }
//    @Test
//    void testDelete() {
//        System.out.println(studentService.delete(5));
//    }
//    @Test
//    void testGetAll() {
//        System.out.println(studentService.getall());
//    }
//    @Test
//    void testGetPage() {
//        IPage page1 = studentService.getPage(1,5);
//        System.out.println(page1.getRecords());
//    }

//    @Test
//    void testGetWhere() {
//        QueryWrapper<Student> queryWrapper=new QueryWrapper<>();
//        queryWrapper.like("stu_name","老");
//        System.out.println(studentDao.selectList(queryWrapper));
//    }
//    @Test
//    void testGetWhere02() {
//        String stuname="";
//        LambdaQueryWrapper<Student> queryWrapper=new LambdaQueryWrapper<>();
////        queryWrapper.like(Student::getStuName,"老");
//        queryWrapper.like(stuname!=null,Student::getStuName,stuname);
//        System.out.println(studentDao.selectList(queryWrapper));
//    }
}
