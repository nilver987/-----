package com.example.msvehicle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


import java.time.LocalDate;

import lombok.Data;

@Entity
@Data
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private LocalDate maintenanceDate;
    private String status;  // completed, pending
    private Double cost;

}
