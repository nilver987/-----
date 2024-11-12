package com.example.mspassenger.entity;
import jakarta.persistence.*;


import java.time.LocalDate;

import lombok.Data;

@Entity
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private LocalDate maintenanceDate;
    private String status;  // completed, pending
    private Double cost;
}
