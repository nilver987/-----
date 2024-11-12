package com.example.msroute.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "terminal_origin_id")
    private Terminal terminalOrigin;

    @ManyToOne
    @JoinColumn(name = "terminal_destination_id")
    private Terminal terminalDestination;

    private Integer distanceKm;

}