package pocit.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import pocit.dto.Tblbodega;

@Path("/bodega")
@RegisterRestClient(configKey = "bl-inventory.service.url")
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public interface BlInventoryBodega {

    @GET
    @Path("/buscarPorId/{id}")
    Response getById(@PathParam("id") int id);

    @GET
    @Path("/buscarPorNombre/{nombre}")
    Response getByName(@PathParam("nombre") String nombre);

    @GET
    @Path("/listar")
    Response listar();


    @POST
    @Path("/guardar")
    Response save(Tblbodega bodega);

    @PUT
    @Path("/actualizar")
    Response update(Tblbodega bodega);

}
