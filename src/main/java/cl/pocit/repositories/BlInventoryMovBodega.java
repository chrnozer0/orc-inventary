package cl.pocit.repositories;

import cl.pocit.dto.Tblmovimientobodega;
import cl.pocit.entities.Movimientobodega;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/movimientobodega")
@RegisterRestClient(configKey = "bl-inventory.service.url")
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public interface BlInventoryMovBodega {

    @GET
    @Path("/buscarPorId/{idmovimientobodega}")
    List<Movimientobodega> getById(@PathParam("idmovimientobodega") int id);

    @GET
    @Path("/buscarPorIdBodega/{idBodega}")
    List<Movimientobodega> getByIdBodega(@PathParam("idBodega") int idBodega) ;

    @POST
    @Path("/guardar")
    Movimientobodega save(Tblmovimientobodega movimientobodega);

    @PUT
    @Path("/actualizar")
    Movimientobodega update(Tblmovimientobodega movimientobodega);
}
