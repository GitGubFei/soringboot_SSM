package com.itfei.services;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itfei.domain.News;

import java.util.List;

public interface NewsinfoService extends IService<News> {
    News getById(Integer id);
    List<News> getAllNews();
    IPage<News> getPage(int currentPage, int pageSize,News news);
}
