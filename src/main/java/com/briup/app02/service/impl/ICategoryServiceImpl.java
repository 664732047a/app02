package com.briup.app02.service.impl;

import com.briup.app02.bean.Category;
import com.briup.app02.bean.CategoryExample;
import com.briup.app02.bean.extend.CategoryExtend;
import com.briup.app02.dao.CategoryMapper;
import com.briup.app02.dao.extend.CategoryExtendMapper;
import com.briup.app02.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ICategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Resource
    private CategoryExtendMapper categoryExtendMapper;

    @Override
    public List<Category> findAll() {
        CategoryExample example = new CategoryExample();
        return categoryMapper.selectByExample(example);
    }

    @Override
    public void save(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public List<CategoryExtend> findCateGoryTree() {
        return categoryExtendMapper.selectCategoryTree();
    }
}
