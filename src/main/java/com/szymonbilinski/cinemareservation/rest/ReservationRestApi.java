package com.szymonbilinski.cinemareservation.rest;

import com.szymonbilinski.cinemareservation.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationRestApi {
    final ReservationService reservationService;

    public ReservationRestApi(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping(value = "/reservation/add/{seat}")
    private ResponseEntity<?> addNewReservation(@PathVariable("seat") String seat){
        return new ResponseEntity<>(reservationService.checkSeat(seat), HttpStatus.OK);
    }
}
