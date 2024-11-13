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
    private Integer terminal_origin_id;           //
    private Integer terminal_destination_id;
    private Integer distanceKm;
    private Integer terminalId;

}