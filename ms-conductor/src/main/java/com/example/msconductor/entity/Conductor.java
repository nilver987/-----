package com.example.msconductor.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Conductor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String licenseNumber;

    private String phoneNumber;
}
