package com.store.store;

//import com.store.store.entities.products.BrandEntity;
import com.store.store.entities.products.BrandEntity;
import com.store.store.repositories.BaseRepository;
import com.store.store.services.products.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StoreApplication.class, args);
	}

}
