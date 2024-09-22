package org.acme.cc_approval.service;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.cc_approval.model.Coffee;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/coffee")
@RegisterRestClient(configKey = "coffeeresource")
public interface CoffeeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Coffee> getCoffees();

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Coffee getCoffee(@PathParam("name") String name);

}