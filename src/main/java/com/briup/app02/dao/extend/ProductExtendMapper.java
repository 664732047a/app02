package com.briup.app02.dao.extend;

import com.briup.app02.bean.extend.ProductExtend;

import java.util.List;

public interface ProductExtendMapper {
    List<ProductExtend> selectAllWithCategory();
}
