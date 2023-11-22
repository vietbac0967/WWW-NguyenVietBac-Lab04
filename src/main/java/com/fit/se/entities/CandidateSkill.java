package com.fit.se.entities;

import com.fit.se.enums.SkillLevel;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CandidateSkill {
    private String moreInfos;
    private SkillLevel skillLevel;
    private Skill skill;
    private Candidate candidate;
}
