package com.briup.app02.web.controller;

import com.briup.app02.bean.Category;
import com.briup.app02.bean.extend.CategoryExtend;
import com.briup.app02.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("findAll")
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @PostMapping("save")
    public String save(Category category){
        categoryService.save(category);
        return "保存成功";
    }

    @GetMapping("findCategoryTree")
    public List<CategoryExtend> findCategoryTree(){
        return categoryService.findCateGoryTree();
    }


}
