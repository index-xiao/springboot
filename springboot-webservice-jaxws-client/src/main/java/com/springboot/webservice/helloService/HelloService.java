package com.springboot.webservice.helloService;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String sayHello(String name) throws Exception {
		
	/*	String address = "htttp://localhost:8080/services/user/sayHello?wsdl";
		JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
		bean.setAddress(address);*/
		String address = "http://localhost:8080/services/user?wsdl";
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
	     Client client = dcf.createClient(address);
	     Object[] invoke = client.invoke("sayHello", name);
		
		return invoke[0].toString();
	}
}
