package com.games.mobile.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.mobile.domain.Product;
import com.games.mobile.repositories.ProductRepository;

@Service
public class DbService {

	@Autowired
	private ProductRepository productRepository;

	public void instanciaBasedeDados() {

		Product prod1 = new Product(null, "Age of Empires 4", 99.99, 9.5, "www.ageofempires.com");
		Product prod2 = new Product(null, "Crusader kings 3", 45.89, 8.5, "www.paradoxplaza.com");
		Product prod3 = new Product(null, "Humankind", 56.67, 5.5, "https://humankind.game");
		Product prod4 = new Product(null, "New World", 45.47, 9.1, "www.newworld.com");

		productRepository.saveAll(Arrays.asList(prod1, prod2, prod3, prod4));

	}

}
