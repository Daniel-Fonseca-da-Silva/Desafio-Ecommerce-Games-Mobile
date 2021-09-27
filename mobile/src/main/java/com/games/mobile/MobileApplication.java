package com.games.mobile;

import com.games.mobile.domain.Product;
import com.games.mobile.repositories.ProductRepository;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MobileApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MobileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product prod1 = new Product(null, "Age of Empires 4", 99.99, 9.5, "www.ageofemp.com");

		productRepository.saveAll(Arrays.asList(prod1));

	}
}
