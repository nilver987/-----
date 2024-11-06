package com.example.msvehicle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import lombok.Data;

import java.time.LocalDate;

@Entity
@Data

public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String description;
    private LocalDate maintenanceDate;
    private String status;  // completed, pending
    private Double cost;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Vehicle vehicle;
}
