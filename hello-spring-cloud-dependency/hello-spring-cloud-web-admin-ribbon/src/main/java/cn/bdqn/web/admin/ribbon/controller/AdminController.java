package cn.bdqn.web.admin.ribbon.controller;

import cn.bdqn.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi/{message}", method = RequestMethod.GET)
    public String sayHi(@PathVariable("message") String message) {
        return adminService.sayHi(message);
    }
}
