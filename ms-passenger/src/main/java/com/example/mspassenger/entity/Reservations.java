package com.example.mspassenger.entity;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Entity
@Data
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String seatNumber;
    private Date reservationDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    public enum Status {
        CONFIRMED,
        CANCELLED,
        PENDING
    }


    //FOREIGN KEY (trip_id) REFERENCES trips(id)
}
