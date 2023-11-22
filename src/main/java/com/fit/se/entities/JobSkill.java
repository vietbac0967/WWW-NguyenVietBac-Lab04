package com.fit.se.entities;

import com.fit.se.enums.SkillLevel;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class JobSkill {
    private String moreInfos;
    private SkillLevel skillLevel;
    private Job job;
    private Skill skill;
}
