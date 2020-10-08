package br.com.sciensa;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.quarkus.panache.common.Sort;

@Path("/cars")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class CarsResource {

    @GET
    public List<Cars> hello() {
        return Cars.listAll(Sort.by("marca"));
    }

    @POST
    @Transactional
    public Response create(Cars cars){
        cars.persist();
        return Response.ok(cars).status(201).build();
    }
}