package com.mkyong.ws;
 
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{
 
	@WebMethod String getHelloWorldAsString(String name);
	@WebMethod String getMyNameAsString(String name);
	@WebMethod ResponseDataArrayList getProdList();
}