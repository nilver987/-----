package com.example.msvehicle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String plateNumber;

    private String model;

    private Integer capacity;

    @Enumerated(EnumType.STRING)
    private VehicleStatus status; // Enum: Available, In_Maintenance, Not_Available

    // Getters and Setters
    public enum VehicleStatus {
        AVAILABLE,
        IN_MAINTENANCE,
        NOT_AVAILABLE
    }
}


