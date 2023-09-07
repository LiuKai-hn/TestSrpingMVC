package com.liukai.mvc.pojo;

/**
 * @Author：liukai
 * @Date：2023/9/6 16:33
 */
public class Emp {

    private String username;
    private String password;

    public Emp() {
    }

    public Emp(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
