package com.pfa.pfaemplacementservice.feign;

import com.pfa.pfaemplacementservice.model.Depot;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PFA-DEPOT-SERVICE")
public interface DepotRestClient {
    @GetMapping(path = "/depots/{id}")
    public Depot getDepotById(@PathVariable(name="id") int id);
}
