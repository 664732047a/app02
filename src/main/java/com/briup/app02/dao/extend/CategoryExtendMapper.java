package com.briup.app02.dao.extend;

import com.briup.app02.bean.Category;
import com.briup.app02.bean.extend.CategoryExtend;

import java.util.List;

public interface CategoryExtendMapper {
    List<CategoryExtend> selectCategoryTree();

    List<CategoryExtend> selectByParentId(Long id);
}
