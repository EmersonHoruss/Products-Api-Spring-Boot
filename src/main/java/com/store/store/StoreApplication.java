package com.store.store;

//import com.store.store.entities.products.BrandEntity;
import com.store.store.utils.specification.Specification;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StoreApplication.class, args);
		String quer = ":not:(a1<eq>v1)";
		Specification specification2 = new Specification<>(quer);
		//specification2.show();
	}
}
