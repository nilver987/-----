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
    private LocalDate maintenanceDate;
    private LocalDate nextMaintenanceDate;
    @Enumerated(EnumType.STRING)
    private MaintenanceStatus status; // Enum: Passed, Failed




    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Vehicle vehicle;
    public enum MaintenanceStatus {
        PASSED,
        FAILED
    }


}
