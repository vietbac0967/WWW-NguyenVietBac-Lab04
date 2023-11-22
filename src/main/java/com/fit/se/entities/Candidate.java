package com.fit.se.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
    private UUID id;
    private LocalDate dob;
    private String email;
    private String fullName;
    private String phone;
    private Address address;

    public Candidate(UUID id) {
        this.id = id;
    }
}
