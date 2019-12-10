package cn.bdqn.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

@Configuration
public class HystrixDashboardConfiguration {
    //配置熔断监视器  必须手动创建Servlet
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();   //new Servlet
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet); //注册Servlet
        registrationBean.setLoadOnStartup(1);   //Servlet启动顺序
        registrationBean.addUrlMappings("/hystrix.stream"); //mapping
        registrationBean.setName("HystrixMetricsStreamServlet"); //Servlet名字
        return registrationBean;
    }
}
