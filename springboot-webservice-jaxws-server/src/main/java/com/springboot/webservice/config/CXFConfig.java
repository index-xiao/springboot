package com.springboot.webservice.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.webservice.service.HelloService;

@Configuration
public class CXFConfig {
	
	@Autowired
	private Bus bus;

	@Autowired
	private HelloService service;

	/* @Bean public ServletRegistrationBean dispatcherServlet(){ 
		 return new
	 
			  ServletRegistrationBean(new CXFServlet(),"/service/*");
		 }
			 */

	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, service);
		endpoint.publish("/user");
		return endpoint;
	}

}
