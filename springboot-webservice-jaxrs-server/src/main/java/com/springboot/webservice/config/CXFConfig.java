package com.springboot.webservice.config;

 import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.webservice.service.HelloService;

@Configuration
public class CXFConfig {

	/* @Bean
	  public ServletRegistrationBean dispatcherServlet(){
	        return new ServletRegistrationBean(new CXFServlet(),"/service/*");//发布服务名称
	  }*/
	
	 @Autowired
	 private Bus bus;
	
	@Autowired
	private HelloService service;
	
	 @Bean
	    public Endpoint endpoint() {
	        EndpointImpl endpoint = new EndpointImpl(bus, service.c);
	         endpoint.publish("/user");
	         return endpoint;
	    }


	
}
