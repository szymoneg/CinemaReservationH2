package com.szymonbilinski.cinemareservation.service.impl;

import com.szymonbilinski.cinemareservation.domain.model.Room;
import com.szymonbilinski.cinemareservation.domain.model.Seats;
import com.szymonbilinski.cinemareservation.domain.repository.RoomRepo;
import com.szymonbilinski.cinemareservation.domain.repository.SeatsRepo;
import com.szymonbilinski.cinemareservation.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    final RoomRepo roomRepo;
    final SeatsRepo seatsRepo;

    public ReservationServiceImpl(RoomRepo roomRepo, SeatsRepo seatsRepo) {
        this.roomRepo = roomRepo;
        this.seatsRepo = seatsRepo;
    }

    @Override
    public List<Room> getAllRooms() {
        List<Room> rooms = roomRepo.findAllBy();
        return rooms;
    }

    @Override
    public Iterable<Seats> getRoomSeats() {
        return seatsRepo.findAll();
    }
}
