package com.example.msconductor.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Conductor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private Role role;
    public enum Role {
        conductor,
        asistente
    }




    //FOREIGN KEY (trip_id) REFERENCES trips(id),
    // FOREIGN KEY (driver_id) REFERENCES users(id)
}
