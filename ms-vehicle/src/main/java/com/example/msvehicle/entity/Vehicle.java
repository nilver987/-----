package com.example.msvehicle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String plate;
    private String model;
    private String mark;
    private Integer year;
    private Integer capacity;
    private String status; //('available', 'maintenance', 'out_of_service')


    //FOREIGN KEY (driver_id) REFERENCES users(id)

}

