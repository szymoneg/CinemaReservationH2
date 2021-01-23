package com.szymonbilinski.cinemareservation.rest;

import com.szymonbilinski.cinemareservation.service.ClientService;
import com.szymonbilinski.cinemareservation.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestApi {
    final ClientService clientService;
    final ReservationService reservationService;

    public ClientRestApi(ClientService clientService, ReservationService reservationService) {
        this.clientService = clientService;
        this.reservationService = reservationService;
    }

    @GetMapping(value = "/clients/all")
    private ResponseEntity<?> getAllClients(){
        return new ResponseEntity<>(clientService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/room/all")
    private ResponseEntity<?> getAllRooms(){
        return new ResponseEntity<>(reservationService.getRoomSeats(),HttpStatus.OK);
    }
}
