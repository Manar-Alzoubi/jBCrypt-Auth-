package com.example.jBCryptAuth.domain;

import javax.persistence.*;

@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String postContent;

    @ManyToOne
    AppUser newUser;

    public Posts() {
    }

    public Posts(String postContent, AppUser newUser) {
        this.postContent = postContent;
        this.newUser = newUser;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public AppUser getNewUser() {
        return newUser;
    }

    public void setNewUser(AppUser newUser) {
        this.newUser = newUser;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", postContent='" + postContent + '\'' +
                ", newUser=" + newUser +
                '}';
    }
}
