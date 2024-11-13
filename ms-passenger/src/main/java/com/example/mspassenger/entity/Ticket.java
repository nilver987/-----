package com.example.mspassenger.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String ticketNumber;
    private BigDecimal price;
    private LocalDate issuedDate;
    @Enumerated(EnumType.STRING)
    private TicketStatus status; // Enum: Confirmed, Cancelled



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reservation_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Reservations reservations;


    public enum TicketStatus {
        CONFIRMED,
        CANCELLED
    }
}
