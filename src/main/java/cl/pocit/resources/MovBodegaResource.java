package cl.pocit.resources;

import cl.pocit.dto.response.MovimientobodegaDto;
import cl.pocit.dto.response.MovimientobodegadetalleDto;
import cl.pocit.entities.Movimientobodega;
import cl.pocit.services.MovBodegaSrv;
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
public class MovBodegaResource {

    @Inject
    Util util;
    @Inject
    MovBodegaSrv movBodegaSrv;

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorId/{idmovimientobodega}")
    public Response getById(@PathParam("idmovimientobodega") int id) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            movBodegaSrv.getById(id),
                            MovimientobodegaDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorIdBodega/{idBodega}")
    public Response getByIdBodega(@PathParam("idBodega") int idBodega) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            movBodegaSrv.getByIdBodega(idBodega),
                            MovimientobodegaDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @POST
    @Path("/guardar")
    public Response save(MovimientobodegaDto movimientobodegadetalleDto){
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            movBodegaSrv.save(
                                    MapperUtil.map(
                                            movimientobodegadetalleDto,
                                            Movimientobodega.class)
                            ), MovimientobodegaDto.class)
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
    public Response update(MovimientobodegadetalleDto movimientobodegadetalleDto){
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            movBodegaSrv.update(
                                    MapperUtil.map(
                                            movimientobodegadetalleDto,
                                            Movimientobodega.class)
                            ), MovimientobodegadetalleDto.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

}
