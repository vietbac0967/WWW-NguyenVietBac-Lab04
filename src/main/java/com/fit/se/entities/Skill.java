package com.fit.se.entities;

import com.fit.se.enums.SkillType;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Skill {
    private UUID id;
    private String description;
    private String name;
    private SkillType type;

    public Skill(UUID id) {
        this.id = id;
    }


}
