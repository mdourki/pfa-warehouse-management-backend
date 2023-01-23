package com.pfa.pfaemplacementservice;

import com.pfa.pfaemplacementservice.entities.Emplacement;
import com.pfa.pfaemplacementservice.feign.DepotRestClient;
import com.pfa.pfaemplacementservice.model.Depot;
import com.pfa.pfaemplacementservice.repositories.EmplacementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@RequiredArgsConstructor
@EnableFeignClients
public class PfaEmplacementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfaEmplacementServiceApplication.class, args);
    }

    private final RepositoryRestConfiguration restConfiguration;

    @Bean
    CommandLineRunner start(EmplacementRepository emplacementRepository , DepotRestClient depotRestClient) {
        restConfiguration.exposeIdsFor(Emplacement.class);
        return args -> {
            /*Depot depot = depotRestClient.getDepotById(1);
            Emplacement emplacement = emplacementRepository.save
                    (new Emplacement(2 , "A" , "1" , "1" , depot.getId() , 1));*/
        };
    }
}
