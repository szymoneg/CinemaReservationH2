package com.szymonbilinski.cinemareservation.rest;

import com.szymonbilinski.cinemareservation.domain.dto.ReservationRequest;
import com.szymonbilinski.cinemareservation.domain.model.Reservations;
import com.szymonbilinski.cinemareservation.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservationRestApi {
    final ReservationService reservationService;

    public ReservationRestApi(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping(value = "/reservation/add/{seat}")
    private ResponseEntity<?> addNewReservation(@PathVariable("seat") String seat, @RequestBody ReservationRequest reservation){
        if(!reservationService.checkSeat(seat)) {
            return new ResponseEntity<>(reservationService.addNewReservation(reservation,seat), HttpStatus.OK);
        }else{
            return new ResponseEntity<>("This seat isn't empty", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "reservation/getAll")
    private ResponseEntity<?> getAllReservation(){
        return new ResponseEntity<>(reservationService.getAllReservations(), HttpStatus.OK);
    }
}
