package cl.pocit.repositories;

import cl.pocit.dto.Tblbodega;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/bodega")
@RegisterRestClient(configKey = "bl-inventory.service.url")
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public interface BlInventoryBodega {

    @GET
    @Path("/buscarPorId/{id}")
    List<Tblbodega> getById(@PathParam("id") int id);

    @GET
    @Path("/buscarPorNombre/{nombre}")
    List<Tblbodega> getByName(@PathParam("nombre") String nombre);

    @GET
    @Path("/listar")
    List<Tblbodega> listar();


    @POST
    @Path("/guardar")
    Tblbodega save(Tblbodega bodega);

    @PUT
    @Path("/actualizar")
    Tblbodega update(Tblbodega bodega);

}
