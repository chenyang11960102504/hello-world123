package com.huiztech.demoSalary.ccSalary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by chenyang on 2018/6/22.
 */
@Entity
@Table(name = "salaryItem")
public class SalaryItem {

    @Id
    @GeneratedValue
    private Long salaryItemId;

    private String salaryName;

    private String value;

    private int salaryId;

    public SalaryItem( Long salaryItemId,String salaryName, String value, int salaryId) {
        this.salaryItemId=salaryItemId;
        this.salaryName = salaryName;
        this.value = value;
        this.salaryId = salaryId;
    }

    public SalaryItem() {
    }

    public Long getSalaryItemId() {
        return salaryItemId;
    }

    public void setSalaryItemId(Long salaryItemId) {
        this.salaryItemId = salaryItemId;
    }

    public String getSalaryName() {
        return salaryName;
    }

    public void setSalaryName(String salaryName) {
        this.salaryName = salaryName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }
}
