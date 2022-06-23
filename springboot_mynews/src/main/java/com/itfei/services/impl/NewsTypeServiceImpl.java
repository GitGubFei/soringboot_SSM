package com.itfei.services.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itfei.dao.NewsTypeDao;
import com.itfei.domain.NewsType;
import com.itfei.services.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsTypeServiceImpl extends ServiceImpl<NewsTypeDao, NewsType> implements NewsTypeService {
    @Autowired private NewsTypeDao newsTypeDao;
    @Override
    public List<NewsType> getAllNewsType() {
        return newsTypeDao.selectList(null);
    }

    @Override
    public IPage<NewsType> getPage(int currentPage, int pageSize, NewsType newsType) {
        return null;
    }
}
