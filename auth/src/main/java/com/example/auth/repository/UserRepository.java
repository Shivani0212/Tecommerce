package com.example.auth.repository;

import com.example.auth.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    public User save(User user) {
        users.put(user.getUsername(), user);
        return user;
    }

    public User findByUsername(String username) {
        return users.get(username);
    }
}
