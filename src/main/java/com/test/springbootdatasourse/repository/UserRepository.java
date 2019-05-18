package com.test.springbootdatasourse.repository;

import com.test.springbootdatasourse.bean.User;

import java.util.List;

public interface UserRepository {

    int save(User user);
    int update(User user);
    int delete(int id);
    User findById(int id);
    List<User> findAll();
}
