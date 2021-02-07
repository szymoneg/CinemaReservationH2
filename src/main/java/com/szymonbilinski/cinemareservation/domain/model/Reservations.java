package com.szymonbilinski.cinemareservation.domain.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    private long idReservation;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "tele_no")
    private String teleNo;

    @Column(name = "price")
    private Double price;

    @OneToOne
    @JoinColumn(name = "id_seat", referencedColumnName = "id_seat")
    private Seats seats;

    @OneToOne
    @JoinColumn(name = "id_repertoire", referencedColumnName = "id_repertoire")
    private Repertoire repertoire;
}
