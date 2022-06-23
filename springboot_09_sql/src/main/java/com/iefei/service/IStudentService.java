package com.iefei.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.iefei.domain.Student;

public interface IStudentService extends IService<Student> {
    IPage<Student> getPage(int currentPage, int pageSize);
    IPage<Student> getPage(int currentPage, int pageSize, Student student);

}
