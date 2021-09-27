package com.games.mobile;

import com.games.mobile.domain.Product;
import com.games.mobile.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MobileApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MobileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
