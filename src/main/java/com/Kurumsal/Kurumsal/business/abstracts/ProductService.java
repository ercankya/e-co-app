package com.Kurumsal.Kurumsal.business.abstracts;

import com.Kurumsal.Kurumsal.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
