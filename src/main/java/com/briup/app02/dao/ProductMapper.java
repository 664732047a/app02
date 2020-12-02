package com.briup.app02.dao;

import com.briup.app02.bean.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> selectAll();

    void insert(Product product);

    void deleteById(Long id);

    void updeteById(Product product);


}
