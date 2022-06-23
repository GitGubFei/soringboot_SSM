package com.itfei.controller;

import com.itfei.services.NewsTypeService;
import com.itfei.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
@RequestMapping("/userallnewstype")
public class UserNewsType {@Autowired
private NewsTypeService newsTypeService;
    @GetMapping
    public R getAllNewsType(){
        return new R(true,newsTypeService.getAllNewsType());
    }
    @GetMapping("{id}")
    public R getNewsType(@PathVariable Integer id){
        return new R(true,newsTypeService.getById(id));
    }
}
