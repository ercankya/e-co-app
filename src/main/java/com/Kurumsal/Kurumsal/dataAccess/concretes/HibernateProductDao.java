package com.Kurumsal.Kurumsal.dataAccess.concretes;

import com.Kurumsal.Kurumsal.dataAccess.abstracts.ProductDao;
import com.Kurumsal.Kurumsal.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println(product.getName()+" urun hibrnate ile eklendi \n");
    }

    @Override
    public void delete(Product product) {
        System.out.println("urun hibrnate ile silindi \n"+product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("urun hibrnate ile guncellendi \n"+product.getName());
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
