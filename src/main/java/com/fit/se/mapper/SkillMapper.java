package com.fit.se.mapper;

import com.fit.se.entities.Skill;
import com.fit.se.enums.SkillType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class SkillMapper implements RowMapper<Skill> {
    @Override
    public Skill mapRow(ResultSet rs, int rowNum) throws SQLException {
        String id = rs.getString("skill_id");
        String description = rs.getString("skill_description");
        String name = rs.getString("skill_name");
        int type = rs.getInt("type");

        return new Skill(UUID.fromString(id), description, name, SkillType.convert(type));
    }
}
