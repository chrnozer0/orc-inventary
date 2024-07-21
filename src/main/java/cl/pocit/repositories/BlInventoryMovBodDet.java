package cl.pocit.repositories;

import cl.pocit.dto.Tblmovimientobodegadetalle;
import cl.pocit.entities.Movimientobodegadetalle;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/movimientobodegadetalle")
@RegisterRestClient(configKey = "bl-inventory.service.url")
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public interface BlInventoryMovBodDet {

    @GET
    @Path("/buscarPorId/{id}")
    List<Movimientobodegadetalle> getById(@PathParam("id") int id) ;

    @GET
    @Path("/buscarPorIdMovimientoBodega/{idmovimientobodega}")
    List<Movimientobodegadetalle> getByIdMovimientoBodega(@PathParam("idmovimientobodega") int idmovimientobodega);

    @GET
    @Path("/buscarPorIdBodega/{idBodega}")
    List<Movimientobodegadetalle> getByIdBodega(@PathParam("idBodega") int idBodega);

    @GET
    @Path("/buscarPorIdProducto/{idproducto}")
    List<Movimientobodegadetalle> getByIdProducto(@PathParam("idproducto") int idproducto);

    @POST
    @Path("/guardar")
    Movimientobodegadetalle save(Tblmovimientobodegadetalle movimientobodegadetalle);

    @PUT
    @Path("/actualizar")
    Movimientobodegadetalle update(Tblmovimientobodegadetalle movimientobodegadetalle);
}
