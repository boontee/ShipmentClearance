package org.acme.cc_approval.service;

import java.util.Collection;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.acme.cc_approval.model.Coffee;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class CoffeeService {

    @Inject
    @RestClient
    CoffeeResource coffeeResource;

    public Collection<Coffee> getCoffees() {
        System.out.println("Kogito calling our CoffeeService microservice!");
        return coffeeResource.getCoffees();
    }

}
