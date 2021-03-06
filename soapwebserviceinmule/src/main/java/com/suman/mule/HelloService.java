package com.suman.mule;

import java.util.Date;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
/**
* SOAP web service endpoint implementation class that implements
* a service that extends greetings.
*/
//http://localhost:8081/services/GreetingService?wsdl

@WebService
public class HelloService
{
/**
* Default constructor. Logs creation of service instances.
*/
	public HelloService()
	{
		System.out.println("***** HelloService instance created.");
	}
/**
* Greets the person with the supplied name.
*
* @param inName Name of person to greet.
* @return Greeting.
*/
	@WebResult(name="greeting")
	public String greet(@WebParam(name="name") String inName)
	{
		return "Hello " + inName + ", the time is now " + new Date();
	}
}
