package com.test.springbootdatasourse.bean;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsn(resultSet.getString("usn"));
        user.setPwd(resultSet.getString("pwd"));
        return user;
    }
}
