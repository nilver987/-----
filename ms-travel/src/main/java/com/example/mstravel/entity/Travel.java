package com.example.mstravel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private LocalDateTime estimatedArrival;

    private String status;  // pending, in progress, completed
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conductor_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Conductor conductor;

}



