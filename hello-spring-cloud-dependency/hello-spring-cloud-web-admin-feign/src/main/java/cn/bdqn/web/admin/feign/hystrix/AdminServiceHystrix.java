package cn.bdqn.web.admin.feign.hystrix;

import cn.bdqn.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix  implements AdminService{


    @Override
    public String sayHi(String message) {
        return String.format("请求出现错误，你的message是 : %s",message);
    }
}
