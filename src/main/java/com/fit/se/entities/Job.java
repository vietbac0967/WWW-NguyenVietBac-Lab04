package com.fit.se.entities;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Job {
    private UUID id;
    private String desc;
    private String name;
    private Company company;

    public Job(UUID id) {
        this.id = id;
    }
}
