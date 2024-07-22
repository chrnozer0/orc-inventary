package cl.pocit.resources;

import cl.pocit.dto.response.MovimientobodegaDto;
import cl.pocit.dto.response.MovimientobodegadetalleDto;
import cl.pocit.dto.response.OrigenproductoDto;
import cl.pocit.entities.Movimientobodega;
import cl.pocit.entities.Origenproducto;
import cl.pocit.services.OrigenProductoSrv;
import cl.pocit.util.MapperUtil;
import cl.pocit.util.Util;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path("/movimientobodega")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class origenProductoResource {

    @Inject
    Util util;
    @Inject
    OrigenProductoSrv origenProductoSrv;

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorId/{id}")
    public Response getById(@PathParam("id") int id) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            origenProductoSrv.getById(id),
                            MovimientobodegaDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorNombre/{nombre}")
    public Response getByIdBodega(@PathParam("nombre") String name) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            origenProductoSrv.getByName(name),
                            OrigenproductoDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @POST
    @Path("/guardar")
    public Response save(OrigenproductoDto origenproductoDto){
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            origenProductoSrv.save(
                                    MapperUtil.map(
                                            origenproductoDto,
                                            Origenproducto.class)
                            ), OrigenproductoDto.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @PUT
    @Path("/actualizar")
    public Response update(OrigenproductoDto origenproductoDto){
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            origenProductoSrv.update(
                                    MapperUtil.map(
                                            origenproductoDto,
                                            Origenproducto.class)
                            ), OrigenproductoDto.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

}
