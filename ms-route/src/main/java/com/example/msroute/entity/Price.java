package com.example.msroute.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String vehicleType;  // Bus, Van, etc.
    private Double price;
    private LocalDate validFrom;
    private LocalDate validTo;



}
