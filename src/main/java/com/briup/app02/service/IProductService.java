package com.briup.app02.service;

import com.briup.app02.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void insert(Product product);

    void deleteById(Long id);

    void updateById(Product product);
}
