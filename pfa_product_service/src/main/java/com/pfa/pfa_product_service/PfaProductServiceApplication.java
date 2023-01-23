package com.pfa.pfa_product_service;

import com.pfa.pfa_product_service.entities.Product;
import com.pfa.pfa_product_service.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@RequiredArgsConstructor
public class PfaProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfaProductServiceApplication.class, args);
    }

    private final RepositoryRestConfiguration restConfiguration;

    @Bean
    CommandLineRunner start(ProductRepository productRepository ) {
        restConfiguration.exposeIdsFor(Product.class);
        return args -> {
        };
    }
}
