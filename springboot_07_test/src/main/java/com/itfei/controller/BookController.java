package com.itfei.controller;

import com.itfei.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
//    @GetMapping
//    public String getBookById(){
//        System.out.println("调用根据id查询书本");
//        return "springboot";
//    }
    @GetMapping
    public Book getBookById(){
        System.out.println("调用根据id查询书本");
        Book book=new Book();
        book.setName("spring");
        book.setId(1);
        book.setType("教科书");
        book.setDescription("很好的一本书");
        return book;
    }
}
