package com.iefei.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iefei.dao.StudentDao;
import com.iefei.domain.Student;
import com.iefei.service.IStudentService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplMP extends ServiceImpl<StudentDao, Student> implements IStudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public IPage<Student> getPage(int currentPage, int pageSize) {
        IPage page=new Page(currentPage,pageSize);
        studentDao.selectPage(page,null);
        return page;
    }

    @Override
    public IPage<Student> getPage(int currentPage, int pageSize, Student student) {
        LambdaQueryWrapper<Student> studentLambdaQueryWrapper=new LambdaQueryWrapper<>();
        studentLambdaQueryWrapper.like(Strings.isNotEmpty(student.getStuName()),Student::getStuName,student.getStuName());
        studentLambdaQueryWrapper.like(Strings.isNotEmpty(student.getStuPhone()),Student::getStuPhone,student.getStuPhone());
        studentLambdaQueryWrapper.like(Strings.isNotEmpty(student.getStuGender()),Student::getStuGender,student.getStuGender());
        IPage page=new Page(currentPage,pageSize);
        studentDao.selectPage(page,studentLambdaQueryWrapper);
        return page;
    }
}
