package cn.bdqn.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String prot;

    @RequestMapping(value = "hi/{message}",method = RequestMethod.GET)
    public String sayHi(@PathVariable("message") String message){
        return String.format("你好 ：%s 你的端口号是 ：%s",message,prot);
    }
}
