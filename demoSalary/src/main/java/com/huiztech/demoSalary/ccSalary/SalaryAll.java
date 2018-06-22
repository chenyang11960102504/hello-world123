package com.huiztech.demoSalary.ccSalary;

import java.util.List;

/**
 * Created by chenyang on 2018/6/22.
 */
public class SalaryAll {
    private String username;

    private int year;

    private int month;

   private List<SalaryItem> salaryItemList;

    public SalaryAll(String username, int year, int month, List<SalaryItem> salaryItemList) {
        this.username = username;
        this.year = year;
        this.month = month;
        this.salaryItemList = salaryItemList;
    }


    public SalaryAll() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public List<SalaryItem> getSalaryItemList() {
        return salaryItemList;
    }

    public void setSalaryItemList(List<SalaryItem> salaryItemList) {
        this.salaryItemList = salaryItemList;
    }
}
