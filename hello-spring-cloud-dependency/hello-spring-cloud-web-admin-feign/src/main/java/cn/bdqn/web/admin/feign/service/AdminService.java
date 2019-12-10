package cn.bdqn.web.admin.feign.service;

import cn.bdqn.web.admin.feign.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "spring-cloud-service-admin" ,fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi/{message}",method = RequestMethod.GET)
    public String sayHi(@PathVariable("message") String message);
}
