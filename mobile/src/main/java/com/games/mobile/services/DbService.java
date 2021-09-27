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

		Product prod1 = new Product(null, "Age of Empires 4", 99.99, 9.5, "www.ageofemp.com");

		productRepository.saveAll(Arrays.asList(prod1));

	}

}
