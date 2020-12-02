package com.briup.app02.service;

import com.briup.app02.bean.Category;
import com.briup.app02.bean.extend.CategoryExtend;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void save(Category category);

    List<CategoryExtend> findCateGoryTree();
}
