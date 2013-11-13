package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
//http://localhost:4343/myrest ---type this url for for access
@Path("/myrest")
public class HelloWorldResource {
	
	@GET
	public String getWelcomeMsg() throws Exception{
		return "Congratulations This is your first restful Webservice!!!!";
	}
}
