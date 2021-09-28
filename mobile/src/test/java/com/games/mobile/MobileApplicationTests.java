package com.games.mobile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.games.mobile.domain.Product;
import com.games.mobile.services.ProductService;

@SpringBootTest
class MobileApplicationTests {

	@Autowired
	private ProductService service;

	@Test
	public void testFind() {
		Product prod = new Product();

		prod.setName("Sim City 4");
		prod.setPrice(58.96);
		prod.setScore(8.5);
		prod.setImage("www.simcity4.city.jpg");
		
//		Integer id = prod.getId();
//		assertNotNull(id);

		service.create(prod);
	}

}
