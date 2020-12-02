package com.briup.app02.service.impl;

import com.briup.app02.bean.Product;
import com.briup.app02.dao.ProductMapper;
import com.briup.app02.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.selectAll();
    }

    @Override
    public void insert(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void deleteById(Long id) {
        productMapper.deleteById(id);
    }
}