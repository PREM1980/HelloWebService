package com.mkyong.ws;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.mkyong.ws.HelloWorld", serviceName = "HelloPrem", name = "MyCustomerServices")
public class HelloWorldImpl implements HelloWorld {
	// @WebMethod(operationName = "sayHello")
	public String getHelloWorldAsString(String name) {
		// TODO Auto-generated method stub
		// return "Hello World JAX-WS " + name;
		return "Hello!! My name is " + name;
	}

	public String getMyNameAsString(String name) {
		// TODO Auto-generated method stub
		return "Hello!! My Name is  " + name;
	}

	public ResponseDataArrayList getProdList() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Meeting at 12");
		al.add("School at 10am on 6");
		al.add("Holiday on 8th");

		ResponseDataArrayList objwrapper = new ResponseDataArrayList();
		objwrapper.setList(al);

		return objwrapper;
	}

}

