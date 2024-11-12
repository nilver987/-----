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
    @ManyToOne
    @JoinColumn(name = "terminal_origin_id")
    private Terminal terminalOrigin;

    @ManyToOne
    @JoinColumn(name = "terminal_destination_id")
    private Terminal terminalDestination;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private Integer availableSeats;



    //FOREIGN KEY (route_id) REFERENCES routes(id),
    //FOREIGN KEY (vehicle_id) REFERENCES vehicles(id),



}




