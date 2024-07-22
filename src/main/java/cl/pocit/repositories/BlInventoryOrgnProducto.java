package cl.pocit.repositories;

import cl.pocit.dto.Tblmovimientobodega;
import cl.pocit.dto.Tblorigenproducto;
import cl.pocit.entities.Movimientobodega;
import cl.pocit.entities.Origenproducto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/origenproducto")
@RegisterRestClient(configKey = "bl-inventory.service.url")
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public interface BlInventoryOrgnProducto {

    @GET
    @Path("/buscarPorId/{id}")
    List<Origenproducto> getById(@PathParam("id") int id);

    @GET
    @Path("/buscarPorNombre/{nombre}")
    List<Origenproducto> getByName(@PathParam("nombre") String name);

    @POST
    @Path("/guardar")
    Origenproducto save(Tblorigenproducto movimientobodega);

    @PUT
    @Path("/actualizar")
    Origenproducto update(Tblorigenproducto movimientobodega);
}
