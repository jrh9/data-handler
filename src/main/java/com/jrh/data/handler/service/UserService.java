package com.jrh.data.handler.service;

import com.jrh.data.handler.model.User;

public interface UserService {

    public Iterable<User> getUsers();

    public User addUser(String userJson) throws Exception;

    public User getUserByName(String username);

    public User getUserById(int id);

}