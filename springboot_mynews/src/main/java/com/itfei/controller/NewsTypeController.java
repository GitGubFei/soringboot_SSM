package com.itfei.controller;

import com.itfei.domain.NewsType;
import com.itfei.services.NewsTypeService;
import com.itfei.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@Controller
@RequestMapping("/allnewstype")
public class NewsTypeController {
    @Autowired private NewsTypeService newsTypeService;
    @GetMapping
    public R getAllNewsType(){
        return new R(true,newsTypeService.getAllNewsType());
    }
    @GetMapping("{id}")
    public R getNewsType(@PathVariable Integer id){
        return new R(true,newsTypeService.getById(id));
    }
    @PostMapping
    public R save(@RequestBody NewsType newsType){
        Boolean flag=newsTypeService.save(newsType);
        return new R(flag,flag?"添加成功^_^":"添加失败-_-!!!");
    }
    @PutMapping
    public R update(@RequestBody NewsType newsType){
        return new R(newsTypeService.updateById(newsType));
    }
    @DeleteMapping("{id}")
    public R dalNewsType(@PathVariable Integer id){
        return new R(true,newsTypeService.removeById(id));
    }
}
