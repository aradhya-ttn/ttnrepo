package com.ToTheNew.RestfullAssignment2.entity;

public class UserVersioning2 {
    public UserVersioning2() {
    }

    public UserVersioning2(User user) {
        this.user = user;
    }

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
