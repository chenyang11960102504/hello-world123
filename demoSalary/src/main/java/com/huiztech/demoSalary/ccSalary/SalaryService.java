package com.huiztech.demoSalary.ccSalary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by chenyang on 2018/6/22.
 */
@Service
public class SalaryService {

    @Autowired
    SalaryImp salaryImp;

    @Autowired
    UsersImp usersImp;

    @Autowired
    SalaryItemImp salaryItemImp;


    //根据年份查询工资条
    public Object querySalary1(Long userId){


        Optional<Users> usersList1 = usersImp.findById(userId);

        return usersList1;
    }

}
