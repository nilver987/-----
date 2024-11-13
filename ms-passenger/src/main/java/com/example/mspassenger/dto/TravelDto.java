package com.example.mspassenger.dto;


import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TravelDto {
    private Integer id;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Integer availableSeats;
}
