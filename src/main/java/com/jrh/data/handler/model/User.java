package com.jrh.data.handler.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="karma")
    private int karma;

    public User() {
        // Empty constructor
    }

    public User(int id, String username, String email, int karma) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.karma = karma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return username;
    }

    public void setEmail(String name) {
        this.username = name;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }


    @Override
    public String toString() {
        return String.format(
                "Student [id=%s, username=%s, email=%s, karma=%s]", id,
                username, email, karma);
    }
}