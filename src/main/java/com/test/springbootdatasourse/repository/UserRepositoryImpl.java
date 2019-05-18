package com.test.springbootdatasourse.repository;

import com.test.springbootdatasourse.bean.User;
import com.test.springbootdatasourse.bean.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements  UserRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //update增删改  query查询
    @Override
    public int save(User user) {
        return jdbcTemplate.update("insert into user(usn,pwd,email) values(?,?,?)"
        ,user.getUsn(),user.getPwd(),user.getEmail());
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        List<User> users = jdbcTemplate.query(sql,new UserRowMapper());
        return users;
    }
}
