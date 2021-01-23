package com.szymonbilinski.cinemareservation.rest;

import com.szymonbilinski.cinemareservation.service.RepertoireService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
