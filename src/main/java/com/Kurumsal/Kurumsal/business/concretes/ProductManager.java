package com.Kurumsal.Kurumsal.business.concretes;

import com.Kurumsal.Kurumsal.business.abstracts.ProductService;
import com.Kurumsal.Kurumsal.core.abstracts.LoggerService;
import com.Kurumsal.Kurumsal.dataAccess.abstracts.ProductDao;
import com.Kurumsal.Kurumsal.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("eklenmedi");
        }
        this.productDao.add(product);
        this.loggerService.logToSystem(product.getName()+" urun loglandi");
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
