package com.pd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StudentController {

    @RequestMapping("/queryName")
    public String getNameById(Integer id){
        switch (id){
            case 1:
                return "韦小宝";
            case 2:
                return "令狐冲";
            case 3:
                return "尹志平";
                default:
                    return "查无此人";
        }
    }

}
