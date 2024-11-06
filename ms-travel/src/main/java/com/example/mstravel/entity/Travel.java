package com.example.mstravel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String plate;
    private String model;
    private String mark;
    private Integer year;
    private Integer capacity;
    private String status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maintenance_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Maintenance maintenance;
}


}
