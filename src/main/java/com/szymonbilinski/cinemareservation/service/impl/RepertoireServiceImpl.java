package com.szymonbilinski.cinemareservation.service.impl;

import com.szymonbilinski.cinemareservation.domain.model.Movie;
import com.szymonbilinski.cinemareservation.domain.model.Repertoire;
import com.szymonbilinski.cinemareservation.domain.model.Seats;
import com.szymonbilinski.cinemareservation.domain.repository.RepertoireRepo;
import com.szymonbilinski.cinemareservation.domain.repository.SeatsRepo;
import com.szymonbilinski.cinemareservation.service.RepertoireService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepertoireServiceImpl implements RepertoireService {
    final SeatsRepo seatsRepo;
    final RepertoireRepo repertoireRepo;

    public RepertoireServiceImpl(SeatsRepo seatsRepo, RepertoireRepo repertoireRepo) {
        this.seatsRepo = seatsRepo;
        this.repertoireRepo = repertoireRepo;
    }

    @Override
    public Iterable<Repertoire> getAllMovies() {
        return repertoireRepo.findAll();
    }

    @Override
    public List<Repertoire> getAllMoviesDate(String date) {
        return null;
    }

    @Override
    public List<Seats> getMovieSeats(String movieNum) {
        return null;
    }
}
