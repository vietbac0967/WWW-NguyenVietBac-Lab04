package com.fit.se.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import com.fit.se.entities.Job;
import com.fit.se.entities.JobSkill;
import com.fit.se.entities.Skill;
import com.fit.se.enums.SkillLevel;
import org.springframework.jdbc.core.RowMapper;


public class JobSkillMapper implements RowMapper<JobSkill> {
    @Override
    public JobSkill mapRow(ResultSet rs, int rowNum) throws SQLException {
        String moreInfos = rs.getString("more_infos");
        int skillLevelInt = rs.getInt("skill_level");
        String skillId = rs.getString("skill_id");
        String jobId = rs.getString("job_id");

        Job job = new Job(UUID.fromString(jobId));
        Skill skill = new Skill(UUID.fromString(skillId));
        SkillLevel skillLevel = SkillLevel.convert(skillLevelInt);

        return new JobSkill(moreInfos, skillLevel, job, skill);
    }
}
