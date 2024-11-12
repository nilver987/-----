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
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;

    @ManyToOne
    @JoinColumn(name = "travel_id")
    private Travel travel;

    private LocalDate reservationDate;

    private Integer seatNumber;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status; // Enum: Confirmed, Pending, Cancelled
    public enum ReservationStatus {
        CONFIRMED,
        PENDING,
        CANCELLED
    }

}

