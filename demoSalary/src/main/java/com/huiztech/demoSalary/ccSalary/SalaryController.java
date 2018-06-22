package com.huiztech.demoSalary.ccSalary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenyang on 2018/6/22.
 */
@RestController
@RequestMapping("/api")
public class SalaryController {

    @Autowired
    SalaryService salaryService;

    @ResponseBody
    @RequestMapping(value = "/test1", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public Object function1(Long userId){
        Object obj = salaryService.querySalary1(userId);
        return obj;
    }
}
