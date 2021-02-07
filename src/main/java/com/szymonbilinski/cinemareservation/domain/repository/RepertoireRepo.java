package com.szymonbilinski.cinemareservation.domain.repository;

import com.szymonbilinski.cinemareservation.domain.model.Repertoire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepertoireRepo extends CrudRepository<Repertoire,Long> {
    Repertoire findFirstByIdRepertoire(long id);
}
