package com.szymonbilinski.cinemareservation.domain.model;


import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Repertoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_repertoire")
    private long idRepertoire;

    @OneToOne
    @JoinColumn(name = "id_movie", referencedColumnName = "id_movie")
    private Movie movie;

    @OneToOne
    @JoinColumn(name = "id_room", referencedColumnName = "id_room")
    private Room room;

    @Column(name = "time")
    private Time startTime;
}
