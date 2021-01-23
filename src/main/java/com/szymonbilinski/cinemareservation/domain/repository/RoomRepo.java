package com.szymonbilinski.cinemareservation.domain.repository;

import com.szymonbilinski.cinemareservation.domain.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepo extends CrudRepository<Room,Long> {
    List<Room> findAllBy();
}
