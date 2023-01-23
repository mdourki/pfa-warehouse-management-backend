package com.pfa.pfaemplacementservice.entities;

import com.pfa.pfaemplacementservice.model.Depot;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emplacement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String allee;
    private String nivHoriz;
    private String nivVerti;
    private int depotID;
    private int paletteID;
}
