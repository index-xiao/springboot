package com.springboot.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

@WebService(name = "helloService", // 暴露服务名称
targetNamespace = "http://service.webservice.springboot.com"// 命名空间,一般是接口的包名倒序
)
@Service
public class HelloService {

	@WebMethod
	public String sayHello(String name) {
		return name + ":hello webservice!";
	}
}
