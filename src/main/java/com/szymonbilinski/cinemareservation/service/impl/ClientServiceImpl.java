package com.szymonbilinski.cinemareservation.service.impl;

import com.szymonbilinski.cinemareservation.domain.model.Client;
import com.szymonbilinski.cinemareservation.domain.repository.ClientRepo;
import com.szymonbilinski.cinemareservation.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    final private ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Iterable<Client> findAll() {
        return clientRepo.findAll();
    }
}
