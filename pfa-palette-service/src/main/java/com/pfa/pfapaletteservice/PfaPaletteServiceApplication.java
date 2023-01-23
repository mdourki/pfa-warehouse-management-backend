package com.pfa.pfapaletteservice;

import com.pfa.pfapaletteservice.entities.Palette;
import com.pfa.pfapaletteservice.repositories.PaletteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@RequiredArgsConstructor
public class PfaPaletteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfaPaletteServiceApplication.class, args);
    }

    private final RepositoryRestConfiguration restConfiguration;

    @Bean
    CommandLineRunner start(PaletteRepository paletteRepository ) {
        restConfiguration.exposeIdsFor(Palette.class);
        return args -> {
        };
    }
}
