package com.Kurumsal.Kurumsal;

import com.Kurumsal.Kurumsal.business.abstracts.ProductService;
import com.Kurumsal.Kurumsal.business.concretes.ProductManager;
import com.Kurumsal.Kurumsal.core.concretes.JloggerManagerAdapter;
import com.Kurumsal.Kurumsal.dataAccess.concretes.HibernateProductDao;
import com.Kurumsal.Kurumsal.entities.concretes.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KurumsalApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(KurumsalApplication.class, args);
	}

}
