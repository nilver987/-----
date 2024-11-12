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


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terminal_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Terminal terminal;

    // Enum Status
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('pendiente', 'en proceso', 'completado')")
    private Status status;
    public enum Status {
        PENDING,
        IN_PROGRESS,
        COMPLETED
    }

    //FOREIGN KEY (route_id) REFERENCES routes(id),
    //FOREIGN KEY (vehicle_id) REFERENCES vehicles(id),



}




