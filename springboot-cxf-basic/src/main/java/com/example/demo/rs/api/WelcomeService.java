package com.example.demo.rs.api;

import org.springframework.stereotype.Service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/welcome")
@Service
public interface WelcomeService {
	
	@GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    String welcome(@PathParam("name") String name);

}
