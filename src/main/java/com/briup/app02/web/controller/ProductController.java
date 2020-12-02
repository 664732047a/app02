package com.briup.app02.web.controller;

import com.briup.app02.bean.Product;
import com.briup.app02.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping("save")
    public String save(Product product){
        productService.insert(product);
        return "success";
    }

    @GetMapping("deleteById")
    public String deleteById(Long id){
        productService.deleteById(id);
        return "删除成功";
    }
}
