package com.szymonbilinski.cinemareservation.service;

import com.szymonbilinski.cinemareservation.domain.dto.ReservationRequest;
import com.szymonbilinski.cinemareservation.domain.model.Repertoire;
import com.szymonbilinski.cinemareservation.domain.model.Reservations;
import com.szymonbilinski.cinemareservation.domain.model.Room;
import com.szymonbilinski.cinemareservation.domain.model.Seats;

import java.util.List;

public interface ReservationService {
    List<Room> getAllRooms();

    Iterable<Seats> getRoomSeats();

    boolean checkSeat(String seat);

    Reservations addNewReservation(ReservationRequest newReservation, String seat);

    Seats getSeats(String seat);

    Repertoire getRepertoire(long idRepertoire);

    List<Reservations> getAllReservations();

}
