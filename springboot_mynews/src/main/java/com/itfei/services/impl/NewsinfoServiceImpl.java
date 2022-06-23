package com.itfei.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itfei.dao.NewsinfoDao;
import com.itfei.domain.News;
import com.itfei.services.NewsinfoService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsinfoServiceImpl extends ServiceImpl<NewsinfoDao,News> implements NewsinfoService {
    @Autowired
    private NewsinfoDao newsinfoDao;

    @Override
    public News getById(Integer id) {
        return newsinfoDao.selectById(id);
    }

    @Override
    public List<News> getAllNews() {
        return newsinfoDao.selectList(null);
    }

    @Override
    public IPage<News> getPage(int currentPage, int pageSize,News news) {
        LambdaQueryWrapper<News> newsLambdaQueryWrapper=new LambdaQueryWrapper<>();
        newsLambdaQueryWrapper.like(Strings.isNotEmpty(news.getNewsTitle()),News::getNewsTitle,news.getNewsTitle());
        newsLambdaQueryWrapper.eq(Strings.isNotEmpty(news.getNewsType()),News::getNewsType,news.getNewsType());
        IPage page=new Page(currentPage,pageSize);
        newsinfoDao.selectPage(page,newsLambdaQueryWrapper);
        return page;
    }
}
