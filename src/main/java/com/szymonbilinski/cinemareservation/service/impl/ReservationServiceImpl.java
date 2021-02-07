package com.szymonbilinski.cinemareservation.service.impl;

import com.szymonbilinski.cinemareservation.domain.dto.ReservationRequest;
import com.szymonbilinski.cinemareservation.domain.model.Repertoire;
import com.szymonbilinski.cinemareservation.domain.model.Reservations;
import com.szymonbilinski.cinemareservation.domain.model.Room;
import com.szymonbilinski.cinemareservation.domain.model.Seats;
import com.szymonbilinski.cinemareservation.domain.repository.RepertoireRepo;
import com.szymonbilinski.cinemareservation.domain.repository.ReservationsRepo;
import com.szymonbilinski.cinemareservation.domain.repository.RoomRepo;
import com.szymonbilinski.cinemareservation.domain.repository.SeatsRepo;
import com.szymonbilinski.cinemareservation.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    final RoomRepo roomRepo;
    final SeatsRepo seatsRepo;
    final ReservationsRepo reservationsRepo;
    final RepertoireRepo repertoireRepo;

    public ReservationServiceImpl(RoomRepo roomRepo, SeatsRepo seatsRepo, ReservationsRepo reservationsRepo, RepertoireRepo repertoireRepo) {
        this.roomRepo = roomRepo;
        this.seatsRepo = seatsRepo;
        this.reservationsRepo = reservationsRepo;
        this.repertoireRepo = repertoireRepo;
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

    @Override
    public boolean checkSeat(String seat) {
        if (seatsRepo.findFirstByNumSeat(seat).getNumSeat().equals(seat)){
            return false;
        }else {
            return true;
        }
    }


    @Override
    public Seats getSeats(String seat) {
        return seatsRepo.findFirstByNumSeat(seat);
    }

    @Override
    public Repertoire getRepertoire(long idRepertoire) {
        return repertoireRepo.findFirstByIdRepertoire(idRepertoire);
    }

    @Override
    public Reservations addNewReservation(ReservationRequest newReservation, String seat) {
        Reservations newRes = Reservations.builder()
                .firstName(newReservation.getFirstName())
                .lastName(newReservation.getLastName())
                .teleNo(newReservation.getTeleNo())
                .price(newReservation.getPrice())
                .seats(getSeats(seat))
                .repertoire(getRepertoire(newReservation.getIdRepertoire()))
                .build();
        reservationsRepo.save(newRes);

        Seats oldStatus = seatsRepo.findFirstByNumSeat(seat);
        oldStatus.setStatus(true);
        seatsRepo.save(oldStatus);

        return newRes;
    }

    @Override
    public List<Reservations> getAllReservations() {
        return (List<Reservations>) reservationsRepo.findAll();
    }
}
