package com.jrh.data.handler.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserDao {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="karma")
    private int karma;

    public UserDao() {
        // Empty constructor
    }

    public UserDao(int id, String username, String email, int karma) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.karma = karma;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "UserDao [id=" + id + ", name=" + username +
                ", password=" + password +  " email=" + email + "]";
    }
}

