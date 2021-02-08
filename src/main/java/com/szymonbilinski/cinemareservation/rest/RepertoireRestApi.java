package com.szymonbilinski.cinemareservation.rest;

import com.szymonbilinski.cinemareservation.service.RepertoireService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepertoireRestApi {
    final RepertoireService repertoireService;

    public RepertoireRestApi(RepertoireService repertoireService) {
        this.repertoireService = repertoireService;
    }

    @GetMapping(value = "/repertoire/all")
    public ResponseEntity<?> getAllRepertoire(){
        return new ResponseEntity<>(repertoireService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping(value = "/repertoire/seats/{id_room}")
    public ResponseEntity<?> getRepertoireSeats(@PathVariable("id_room") long idRoom){
        return new ResponseEntity<>(repertoireService.getMovieSeats(idRoom), HttpStatus.OK);
    }
}
