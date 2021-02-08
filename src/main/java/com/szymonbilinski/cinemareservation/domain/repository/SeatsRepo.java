package com.szymonbilinski.cinemareservation.domain.repository;

import com.szymonbilinski.cinemareservation.domain.model.Room;
import com.szymonbilinski.cinemareservation.domain.model.Seats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatsRepo extends CrudRepository<Seats,Long> {
    Seats findFirstByNumSeat(String seat);
    List<Seats> findAllByRoom(Room idRoom);
}
