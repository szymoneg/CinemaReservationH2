package com.szymonbilinski.cinemareservation.service;

import com.szymonbilinski.cinemareservation.domain.model.Movie;
import com.szymonbilinski.cinemareservation.domain.model.Repertoire;
import com.szymonbilinski.cinemareservation.domain.model.Seats;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RepertoireService {
    Iterable<Repertoire> getAllMovies();

    List<Repertoire> getAllMoviesDate(String date);

    List<Seats> getMovieSeats(String movieNum);
}
