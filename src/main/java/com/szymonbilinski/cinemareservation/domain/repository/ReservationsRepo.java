package com.szymonbilinski.cinemareservation.domain.repository;

import com.szymonbilinski.cinemareservation.domain.model.Reservations;
import com.szymonbilinski.cinemareservation.domain.model.Seats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationsRepo extends CrudRepository<Reservations,Long> {
}
