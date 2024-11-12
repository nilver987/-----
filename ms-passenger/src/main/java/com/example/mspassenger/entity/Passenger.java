package com.example.mspassenger.entity;
import jakarta.persistence.*;


import java.time.LocalDate;

import lombok.Data;

@Entity
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;

    private String phoneNumber;
}
