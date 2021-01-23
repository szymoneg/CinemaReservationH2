package com.szymonbilinski.cinemareservation.domain.repository;

import com.szymonbilinski.cinemareservation.domain.model.Seats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsRepo extends CrudRepository<Seats,Long> {
}
