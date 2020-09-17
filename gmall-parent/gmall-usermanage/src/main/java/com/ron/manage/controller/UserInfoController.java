package com.ron.manage.controller;

import com.ron.manage.service.UserInfoService;
import com.ron.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<UserInfo> getUserInfoList() {
        return userInfoService.getUserInfoList();
    }
}
