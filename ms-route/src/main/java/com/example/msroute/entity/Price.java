package com.example.msroute.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private BigDecimal price;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Route route;




}
