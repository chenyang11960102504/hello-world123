package com.huiztech.demoSalary.ccSalary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by chenyang on 2018/6/22.
 */
@Entity
@Table(name = "salary")
public class Salary {

    @Id
    @GeneratedValue
    private Long salaryId;

    private int userId;

    private int year;

    private int month;


    public Salary() {
    }

    public Salary(int userId, int year,int month, Long salaryId) {
        this.salaryId = salaryId;
        this.userId = userId;
        this.year = year;
        this.month= month;
    }

    public Long getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Long salaryId) {
        this.salaryId = salaryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
