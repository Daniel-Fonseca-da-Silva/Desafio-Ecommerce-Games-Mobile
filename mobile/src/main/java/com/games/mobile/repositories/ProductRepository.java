package com.games.mobile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.games.mobile.domain.Product;

@Service
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
