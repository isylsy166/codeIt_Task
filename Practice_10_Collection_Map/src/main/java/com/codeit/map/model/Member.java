package com.codeit.map.model;

public class Member {

    private String id;
    private String name;
    private String password;

    public Member(String password, String name) {
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return id + " " + name + " " + password;
    }
}
