package com.huiztech.demoSalary.ccSalary;

import javax.persistence.*;

/**
 * Created by chenyang on 2018/6/22.
 */
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue
    private Long userId;

    private String name;

    private String dptename;

    private String password;

    private String sex;

    public Users() {
    }

    public Users(Long userId, String name, String dptename, String password, String sex) {
        this.userId = userId;
        this.name = name;
        this.dptename = dptename;
        this.password = password;
        this.sex = sex;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDptename() {
        return dptename;
    }

    public void setDptename(String dptename) {
        this.dptename = dptename;
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
}
