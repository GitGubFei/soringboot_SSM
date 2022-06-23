package com.iefei.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iefei.domain.Student;
import com.iefei.service.IStudentService;
import com.iefei.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;
    @GetMapping
    public R getAll(){
//        return iStudentService.list();
        log.error("error info");
        return new R(true,iStudentService.list());
    }
    @PostMapping
    public R save(@RequestBody Student student){
//        R r=new R();
//        r.setFlag(iStudentService.save(student));
//        r.setData(null);
        Boolean flag=iStudentService.save(student);
        return new R(flag,flag?"添加成功^_^":"添加失败-_-!!!");
    }
    @PutMapping
    public R update(@RequestBody Student student){
//        return iStudentService.updateById(student);
        return new R(iStudentService.updateById(student));
    }
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
//        return iStudentService.removeById(id);
        return new R(iStudentService.removeById(id));
    }
    @GetMapping("{id}")
    public R getStudentById(@PathVariable Integer id){
//        return iStudentService.getById(id);
        return new R(true,iStudentService.getById(id));
    }
//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
////        return iStudentService.getPage(currentPage,pageSize);
//        IPage<Student> page = iStudentService.getPage(currentPage, pageSize);
//        if (currentPage>page.getPages())page = iStudentService.getPage((int)page.getPages(), pageSize);
//
//        return new R(true,page);
//    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Student student){
        System.out.println(student);
//        return iStudentService.getPage(currentPage,pageSize);
        IPage<Student> page = iStudentService.getPage(currentPage, pageSize,student);
        if (currentPage>page.getPages())page = iStudentService.getPage((int)page.getPages(), pageSize,student);
        log.error("error info");
        return new R(true,page);
    }
}
