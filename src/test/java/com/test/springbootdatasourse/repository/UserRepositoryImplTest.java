package com.test.springbootdatasourse.repository;

import com.test.springbootdatasourse.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryImplTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave(){
        User user = new User();
        user.setUsn("aa");
        user.setPwd("123");
        user.setEmail("zhang@qq.com");
        int result = userRepository.save(user);
        System.out.println(result);
        Assert.assertTrue(result>=1);
    }

    @Test
    public void testFindAll(){
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }
}
