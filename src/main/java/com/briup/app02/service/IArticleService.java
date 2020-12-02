package com.briup.app02.service;

import com.briup.app02.bean.Article;

import java.util.List;

public interface IArticleService {
    List<Article> findAll();

    Article findById(Integer id);

    void insertId(Article article);

    void deleteById(Integer id);
}
