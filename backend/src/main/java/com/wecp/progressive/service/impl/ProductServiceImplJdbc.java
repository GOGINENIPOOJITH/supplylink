package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJdbc implements ProductService  {

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public Product getProductById(int productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int addProduct(Product product) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void updateProduct(Product product) {
        // TODO Auto-generated method stub
    }

    @Override
    public void deleteProduct(int productId) {
        // TODO Auto-generated method stub
    }

}