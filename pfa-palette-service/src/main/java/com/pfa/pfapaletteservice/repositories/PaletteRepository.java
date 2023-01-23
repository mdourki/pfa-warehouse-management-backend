package com.pfa.pfapaletteservice.repositories;

import com.pfa.pfapaletteservice.entities.Palette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface PaletteRepository extends JpaRepository<Palette , Integer> {
}
