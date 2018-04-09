package com.jrh.data.handler.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jrh.data.handler.model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jrh.data.handler.repository.UserRepository;
import com.jrh.data.handler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class UserServiceImpl implements UserService {
    private static List<User> users = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

    public User addUser(String userJson) throws Exception {
        try {
            ObjectMapper mapper = new ObjectMapper();
            User newUser = mapper.readValue(userJson, User.class);
            userRepository.save(newUser);

            return newUser;

        } catch (IOException e) {
            throw new Exception("Error occurred when creating new user", e);
        }
    }

    public User getUserByName(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public @ResponseBody
    Iterable<User> getUsers() {
        return userRepository.findAll();
    }

}
