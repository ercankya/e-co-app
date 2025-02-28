package com.Kurumsal.Kurumsal.dataAccess.abstracts;

import com.Kurumsal.Kurumsal.entities.concretes.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    void delete(Product product);
    void update(Product product);

    Product get(int id);
    List<Product> getAll();
}
