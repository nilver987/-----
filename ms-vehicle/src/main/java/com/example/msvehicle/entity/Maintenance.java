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
    @Entity
    public class MaintenanceRecord {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @ManyToOne
        @JoinColumn(name = "vehicle_id")
        private Vehicle vehicle;

        private LocalDate maintenanceDate;

        private LocalDate nextMaintenanceDate;

        @Enumerated(EnumType.STRING)
        private MaintenanceStatus status; // Enum: Passed, Failed

        // Getters and Setters
    }

    public enum MaintenanceStatus {
        PASSED,
        FAILED
    }

}
