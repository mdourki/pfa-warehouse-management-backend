package com.pfa.pfadepotservice;

import com.pfa.pfadepotservice.entities.Depot;
import com.pfa.pfadepotservice.entities.repositories.DepotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@RequiredArgsConstructor
public class PfaDepotServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfaDepotServiceApplication.class, args);
    }

    private final RepositoryRestConfiguration restConfiguration;

    @Bean
    CommandLineRunner start(DepotRepository depotRepository ) {
        restConfiguration.exposeIdsFor(Depot.class);
        return args -> {
        };
    }
}
