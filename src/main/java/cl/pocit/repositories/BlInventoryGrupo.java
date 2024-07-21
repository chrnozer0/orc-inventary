package cl.pocit.repositories;

import cl.pocit.dto.Tblgrupo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/grupo")
@RegisterRestClient(configKey = "bl-inventory.service.url")
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public interface BlInventoryGrupo {

    @GET
    @Path("/buscarPorId/{id}")
    List<Tblgrupo> getById(@PathParam("id") int id) ;

    @GET
    @Path("/buscarPorNombre/{nombre}")
    List<Tblgrupo> getByName(@PathParam("nombre") String nombre) ;

    @POST
    @Path("/guardar")
    Tblgrupo save(Tblgrupo grupo);

    @PUT
    @Path("/actualizar")
    Tblgrupo update(Tblgrupo grupo);
}
