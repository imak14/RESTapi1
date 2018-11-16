package com.ak;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/res")
public class RestResource 
{
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	
	public List<RestPojo> getPojo()
	{
		RestPojo r1= new RestPojo();
		r1.setName("Akshay");
		r1.setAge(27);
		
		RestPojo r2= new RestPojo();
		r2.setName("Vikas");
		r2.setAge(29);
		
		List<RestPojo> ls =new ArrayList<>();
		ls.add(r1);
		ls.add(r2);
		
		return ls;
	}
}
