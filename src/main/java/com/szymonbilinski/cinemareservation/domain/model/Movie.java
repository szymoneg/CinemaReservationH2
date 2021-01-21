package com.szymonbilinski.cinemareservation.domain.model;


import lombok.*;

import javax.persistence.*;

//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovie;
    private String title;
    private String category;
    private String yearProduction;
}
