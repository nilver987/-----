package com.example.mspassenger.service.impl;

import com.example.mspassenger.dto.TravelDto;
import com.example.mspassenger.entity.Reservations;
import com.example.mspassenger.feign.TravelFeign;
import com.example.mspassenger.repository.ReservationsRepository;
import com.example.mspassenger.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationsServiceImpl implements ReservationsService {

    @Autowired
    private ReservationsRepository reservationsRepository;

    @Autowired
    private TravelFeign travelFeign;

    @Override
    public List<Reservations> list() {
        return reservationsRepository.findAll();
    }

    @Override
    public Optional<TravelDto> getById(Integer id) {
        try {
            // Realizamos la llamada al servicio Feign
            ResponseEntity<TravelDto> response = travelFeign.getById(id);

            // Verificamos si la respuesta es válida
            if (response != null && response.getStatusCode().is2xxSuccessful()) {
                TravelDto travelDto = response.getBody();
                if (travelDto != null) {
                    System.out.println("Información del viaje obtenida: " + travelDto);
                    return Optional.of(travelDto);
                } else {
                    System.out.println("No se encontró el viaje con ID: " + id);
                }
            } else {
                System.out.println("Error en la respuesta del servicio Feign para el viaje con ID: " + id);
            }
        } catch (Exception e) {
            System.out.println("Error al hacer la llamada al servicio de viajes: " + e.getMessage());
        }

        return Optional.empty();
    }

    @Override
    public Reservations save(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    @Override
    public Reservations update(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    @Override
    public void delete(Integer id) {
        reservationsRepository.deleteById(id);
    }
}