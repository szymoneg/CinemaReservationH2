package com.szymonbilinski.cinemareservation.service;

import com.szymonbilinski.cinemareservation.domain.model.Room;
import com.szymonbilinski.cinemareservation.domain.model.Seats;

import java.util.List;

public interface ReservationService {
    List<Room> getAllRooms();

    Iterable<Seats> getRoomSeats();

    boolean checkSeat(String seat);
}
