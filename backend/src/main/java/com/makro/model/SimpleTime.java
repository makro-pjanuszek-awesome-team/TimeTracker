package com.makro.model;

public class SimpleTime {
    private String username;
    private float time;

    public SimpleTime(String username, float time) {
        this.username = username;
        this.time = time;
    }

    public SimpleTime withUsername(String username) {
        this.username = username;
        return this;
    }

    public SimpleTime withTime(float time) {
        this.time = time;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public float getTime() {
        return time;
    }
}
