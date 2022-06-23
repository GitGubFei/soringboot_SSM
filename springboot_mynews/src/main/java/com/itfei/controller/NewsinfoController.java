package com.itfei.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itfei.domain.News;
import com.itfei.services.NewsinfoService;
import com.itfei.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/allnews")
public class NewsinfoController {
    @Autowired
    private NewsinfoService newsinfoService;
    @GetMapping("{currentPage}/{pageSize}")
    public R getAll(@PathVariable int currentPage,@PathVariable int pageSize,News news){
        System.out.println(news.toString());
        System.out.println(pageSize);
        IPage<News> page = newsinfoService.getPage(currentPage, pageSize,news);
        if (currentPage>page.getPages())page = newsinfoService.getPage((int)page.getPages(), pageSize,news);
        return new R(true,page);
    }
    @GetMapping("{id}")
    public R getNewsById(@PathVariable Integer id){
        return new R(true,newsinfoService.getById(id));
    }
    @PostMapping public R saveNews(@RequestBody News news){
        Boolean flag=newsinfoService.save(news);
        System.out.println(news);

        return new R(flag,flag?"添加成功":"添加失败");
    }
    @PutMapping public R updateNews(@RequestBody News news){
        System.out.println(news.toString());
        return new R(newsinfoService.updateById(news));
    }
    @DeleteMapping("{id}")
    public R deleteNews(@PathVariable Integer id){
        return new R(newsinfoService.removeById(id));
    }

}
