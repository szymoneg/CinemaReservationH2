package com.szymonbilinski.cinemareservation.domain.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie")
    private long idMovie;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;

    @Column(name = "year_production")
    private String yearProduction;
}
