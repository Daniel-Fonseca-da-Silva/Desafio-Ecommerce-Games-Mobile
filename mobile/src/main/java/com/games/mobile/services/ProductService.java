package com.games.mobile.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.mobile.domain.Product;
import com.games.mobile.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product findById(Integer id) {
		Optional<Product> obj = repository.findById(id);
		return obj.orElse(null);
	}

}
