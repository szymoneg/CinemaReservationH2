package com.szymonbilinski.cinemareservation.service;

import com.szymonbilinski.cinemareservation.domain.model.Client;

import java.util.ArrayList;

public interface ClientService {
    Iterable<Client> findAll();
}
