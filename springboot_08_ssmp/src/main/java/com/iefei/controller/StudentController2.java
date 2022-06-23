package com.iefei.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iefei.domain.Student;
import com.iefei.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/students")
public class StudentController2 {
    @Autowired
    private IStudentService iStudentService;
    @GetMapping
    public List<Student> getAll(){
        return iStudentService.list();
    }
    @PostMapping
    public Boolean save(@RequestBody Student student){
        return iStudentService.save(student);
    }
    @PutMapping
    public Boolean update(@RequestBody Student student){
        return iStudentService.updateById(student);
    }
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return iStudentService.removeById(id);
    }
    @GetMapping("{id}")
    public Student getStudentById(@PathVariable Integer id){
        return iStudentService.getById(id);
    }
    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Student> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return iStudentService.getPage(currentPage,pageSize, null);
    }
}
