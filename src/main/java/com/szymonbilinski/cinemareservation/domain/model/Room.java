package com.szymonbilinski.cinemareservation.domain.model;


import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.mapping.Array;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room {

    @Id
    @Column(name = "id_room")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRoom;

    @Column(name = "number_room")
    private String numberRoom;
}
