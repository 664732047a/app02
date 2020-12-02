package com.briup.app02.bean.extend;

import com.briup.app02.bean.Category;
import com.briup.app02.bean.Product;

public class ProductExtend extends Product {
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
