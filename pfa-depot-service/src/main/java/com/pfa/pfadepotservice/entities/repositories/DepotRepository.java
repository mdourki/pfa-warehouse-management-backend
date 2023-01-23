package com.pfa.pfadepotservice.entities.repositories;

import com.pfa.pfadepotservice.entities.Depot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface DepotRepository extends JpaRepository<Depot , Integer> {
}
