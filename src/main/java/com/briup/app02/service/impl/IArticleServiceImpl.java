package com.briup.app02.service.impl;

import com.briup.app02.bean.Article;
import com.briup.app02.dao.ArticleMapper;
import com.briup.app02.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IArticleServiceImpl implements IArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> findAll() {
        return articleMapper.selectAll();
    }

    @Override
    public Article findById(Integer id) {
        return articleMapper.selectById(id);
    }

    @Override
    public void insertId(Article article) {
        articleMapper.insert(article);
    }

    @Override
    public void deleteById(Integer id) {
        articleMapper.deleteById(id);
    }
}
