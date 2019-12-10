package cn.bdqn.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")     //指定熔断方法
    public String sayHi( String message){
        return restTemplate.getForObject("Http://spring-cloud-service-admin/hi/"+message,String.class);
    }

    public String hiError(String message){
        return String.format("请求出现错误，你的message是 : %s",message);
    }
}
