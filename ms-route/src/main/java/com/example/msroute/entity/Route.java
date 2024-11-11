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
    private String origin;
    private String destination;
    private Integer estimatedDuration;
    private Integer distance;
    private String status;  // active, inactive

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "price_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Price price;
}