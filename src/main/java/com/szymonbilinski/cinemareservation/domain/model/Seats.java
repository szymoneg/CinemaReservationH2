package com.szymonbilinski.cinemareservation.domain.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seat")
    private long idSeats;

    @OneToOne
    @JoinColumn(name = "id_room", referencedColumnName = "id_room")
    private Room room;

    @Column(name = "num_seat")
    private String numSeat;

    @Column(name = "type_seat")
    private boolean typeSeat;
}
