package com.liukai.mvc.pojo;


/**
 * @author liukai
 * @version 1.0
 * @date 2023/9/3 12:20
 */
public class User {

    private Integer id;
    private String username;
    private String password;
    private String sex;
    private String age;
    private String email;


    public User() {
    }

    public User(Integer id, String username, String password, String sex, String age, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }
    public User( String username, String password, String sex, String age, String email) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
