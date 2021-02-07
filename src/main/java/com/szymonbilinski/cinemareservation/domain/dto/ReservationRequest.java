package com.szymonbilinski.cinemareservation.domain.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ReservationRequest {
    private String firstName;
    private String lastName;
    private String teleNo;
    private Double price;
    private long idRepertoire;
}
