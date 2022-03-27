package com.example.jBCryptAuth.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class AppUser {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    private String userName;
    private String password;

    @OneToMany(mappedBy = "newUser")
    List<Posts> userPosts;

    public AppUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AppUser(String name, String password) {
        this.userName = name;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
