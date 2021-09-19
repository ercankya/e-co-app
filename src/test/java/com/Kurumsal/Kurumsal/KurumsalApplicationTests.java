package com.Kurumsal.Kurumsal;

import com.Kurumsal.Kurumsal.business.abstracts.ProductService;
import com.Kurumsal.Kurumsal.business.concretes.ProductManager;
import com.Kurumsal.Kurumsal.core.concretes.JloggerManagerAdapter;
import com.Kurumsal.Kurumsal.dataAccess.concretes.HibernateProductDao;
import com.Kurumsal.Kurumsal.entities.concretes.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KurumsalApplicationTests {

	@Test
	void contextLoads() {
		ProductService productService=new ProductManager(new HibernateProductDao(), new JloggerManagerAdapter());
		Product product=new Product(1,2,50,12,"armut");
		productService.add(product);
	}

}
