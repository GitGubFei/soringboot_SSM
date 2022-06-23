package com.itfei.services;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itfei.domain.NewsType;

import java.util.List;

public interface NewsTypeService extends IService<NewsType> {
    List<NewsType> getAllNewsType();
    IPage<NewsType> getPage(int currentPage,int pageSize,NewsType newsType);
}
