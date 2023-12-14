package com.epam.esm.dao.mapper;
import com.epam.esm.entity.Tag;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TagMapper implements RowMapper<List<Tag>> {
    @Override
    public List<Tag> mapRow(ResultSet rs, int rowNum) throws SQLException {
        List<Tag> tags = new ArrayList<>();
        rs.next();
        while (!rs.isAfterLast()) {
            Tag tag = new Tag();
            tag.setId(rs.getLong("id"));
            tag.setName(rs.getString("tag_name"));
            tags.add(tag);
            rs.next();
        }
        return tags;
    }
}
