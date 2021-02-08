package com.szymonbilinski.cinemareservation.service.impl;

import com.szymonbilinski.cinemareservation.domain.model.Repertoire;
import com.szymonbilinski.cinemareservation.domain.model.Seats;
import com.szymonbilinski.cinemareservation.domain.repository.RepertoireRepo;
import com.szymonbilinski.cinemareservation.domain.repository.RoomRepo;
import com.szymonbilinski.cinemareservation.domain.repository.SeatsRepo;
import com.szymonbilinski.cinemareservation.service.RepertoireService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepertoireServiceImpl implements RepertoireService {
    final SeatsRepo seatsRepo;
    final RepertoireRepo repertoireRepo;
    final RoomRepo roomRepo;

    public RepertoireServiceImpl(SeatsRepo seatsRepo, RepertoireRepo repertoireRepo, RoomRepo roomRepo) {
        this.seatsRepo = seatsRepo;
        this.repertoireRepo = repertoireRepo;
        this.roomRepo = roomRepo;
    }

    @Override
    public Iterable<Repertoire> getAllMovies() {
        return repertoireRepo.findAll();
    }


    //TODO change time to timestamp in db
    @Override
    public List<Repertoire> getAllMoviesDate(String date) {
        return null;
    }

    @Override
    public List<Seats> getMovieSeats(long idRoom) {
        return (List<Seats>) seatsRepo.findAllByRoom(roomRepo.findFirstByIdRoom(idRoom));
    }
}
