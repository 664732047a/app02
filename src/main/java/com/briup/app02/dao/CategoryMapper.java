package com.briup.app02.dao;

import com.briup.app02.bean.Category;
import com.briup.app02.bean.extend.CategoryExtend;

import java.util.List;

public interface CategoryMapper {

    List<Category> selectAll();

    void insert(Category category);

    List<CategoryExtend> selectCategoryTree();

    List<CategoryExtend> selectByParentId(Long id);
}
