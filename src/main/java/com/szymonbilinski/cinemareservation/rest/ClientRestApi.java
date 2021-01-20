package com.szymonbilinski.cinemareservation.rest;

import com.szymonbilinski.cinemareservation.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestApi {
    final ClientService clientService;

    public ClientRestApi(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(value = "/clients/all")
    private ResponseEntity<?> getAllClients(){
        return new ResponseEntity<>(clientService.findAll(), HttpStatus.OK);
    }
}
