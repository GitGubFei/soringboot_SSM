package com.iefei.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iefei.dao.StudentDao;
import com.iefei.domain.Student;
import com.iefei.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Boolean save(Student student) {
        return studentDao.insert(student)>0;
        //return null;
    }

    @Override
    public Boolean update(Student student) {
        return studentDao.updateById(student)>0;
    }

    @Override
    public Boolean delete(Integer id) {
        return studentDao.deleteById(id)>0;
       // return null;
    }

    @Override
    public Student getById(Integer id) {
        return  studentDao.selectById(id);
        //return null;
    }

    @Override
    public List<Student> getall() {
        return studentDao.selectList(null);
       // return null;
    }

    @Override
    public IPage<Student> getPage(int currentPage, int pagesize) {
        IPage page=new Page(currentPage,pagesize);
        return  studentDao.selectPage(page,null);
       // return null;
    }
}
