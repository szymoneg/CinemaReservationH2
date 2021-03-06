package com.szymonbilinski.cinemareservation.domain.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idClient;
    private String firstName;
    private String lastName;
    private String email;
}
