package com.briup.app02.web.controller;

import com.briup.app02.bean.Article;
import com.briup.app02.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @GetMapping("findAll")
    public List<Article> findAll(){
        return articleService.findAll();
    }

    @GetMapping("findById")
    public String findById(){
        return "这是一个文章";
    }

    @GetMapping("deleteById")
    public String deleteById(){
        return "删除成功";
    }

    @PostMapping("saveOrUpdate")
    public String saveOrUpdate(){
        return "success";
    }

    @GetMapping("selectById/{id}")
    public Article selectById(@PathVariable("id") Integer id){
        return articleService.findById(id);
    }

    @PostMapping("insert")
    public String insert(Article article){
        articleService.insertId(article);
        return "redirect:findAll";
    }

    @GetMapping("delete/{id}")
    public String deleteByIDd(@PathVariable("id") Integer id){
        articleService.deleteById(id);
        return "success";
    }
}
