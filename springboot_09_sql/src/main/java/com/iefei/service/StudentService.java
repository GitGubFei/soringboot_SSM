package com.iefei.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iefei.domain.Student;

import java.util.List;

public interface StudentService {
    Boolean save(Student student);
    Boolean update(Student student);
    Boolean delete(Integer id);
    Student getById(Integer id);
    List<Student> getall();
    IPage<Student> getPage(int currentPage,int pagesize);
}
