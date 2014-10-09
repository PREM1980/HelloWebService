//http://stackoverflow.com/questions/20614095/cannot-return-arraylist-from-web-service
package com.mkyong.client;

import java.net.URL;
import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.mkyong.ws.HelloWorld;
import com.mkyong.ws.HelloWorldImpl;
import com.mkyong.ws.ResponseDataArrayList;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {
		System.out.println("Code running");
		URL url = new URL("http://localhost:9999/ws/hello");
		QName qname = new QName("http://ws.mkyong.com/", "HelloPrem");
		Service service = Service.create(url, qname);
		HelloWorld hello = service.getPort(HelloWorld.class);
		System.out.println(hello.getHelloWorldAsString("mkyong"));
		ResponseDataArrayList rs = hello.getProdList();
		rs.getList();
		ArrayList<String> res = hello.getProdList().getList();
		
		for (String s:res)
			System.out.println("result = " + res);
		
		
		//Service service1 = Service.create(url, qname);
		//HelloWorld hello1 = service1.getPort(HelloWorld.class);
		//System.out.println(hello1.getMyNameAsString("Prem"));
	}

}