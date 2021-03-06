package com.briup.app02.service.impl;

import com.briup.app02.bean.Product;
import com.briup.app02.bean.ProductExample;
import com.briup.app02.bean.extend.ProductExtend;
import com.briup.app02.dao.ProductMapper;
import com.briup.app02.dao.extend.ProductExtendMapper;
import com.briup.app02.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Resource
    private ProductExtendMapper productExtendMapper;

    @Override
    public List<Product> findAll() {
        ProductExample example = new ProductExample();
        return productMapper.selectByExample(example);
    }

    @Override
    public void insert(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void deleteById(Long id) {
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateById(Product product) {
        productMapper.updateByPrimaryKey(product);
    }

    @Override
    public List<ProductExtend> findAllWithCategory() {
        return productExtendMapper.selectAllWithCategory();
    }
}
