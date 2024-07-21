
package cl.pocit.resources;

import cl.pocit.dto.response.MovimientobodegadetalleDto;
import cl.pocit.entities.Movimientobodegadetalle;
import cl.pocit.services.MovBodDetSrv;
import cl.pocit.util.MapperUtil;
import cl.pocit.util.Util;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path("/movimientobodegadetalle")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovBodDetResource {
    @Inject
    MovBodDetSrv movBodDetSrv;
    @Inject
    Util util;

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorId/{id}")
    public Response getById(@PathParam("id") int id) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(movBodDetSrv.getById(id), MovimientobodegadetalleDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorIdMovimientoBodega/{idmovimientobodega}")
    public Response getByName(@PathParam("idmovimientobodega") int idmovimientobodega) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            movBodDetSrv.getByIdMovimientoBodega(idmovimientobodega),
                            MovimientobodegadetalleDto.class));
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
                            movBodDetSrv.getByIdBodega(idBodega),
                            MovimientobodegadetalleDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorIdProducto/{idproducto}")
    public Response getByIdProducto(@PathParam("idproducto") int idproducto) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            movBodDetSrv.getByIdProducto(idproducto),
                            MovimientobodegadetalleDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @POST
    @Path("/guardar")
    public Response save(MovimientobodegadetalleDto movimientobodegadetalleDto){
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            movBodDetSrv.save(
                                    MapperUtil.map(movimientobodegadetalleDto, Movimientobodegadetalle.class)
                            ), MovimientobodegadetalleDto.class)
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
                            movBodDetSrv.update(
                                    MapperUtil.map(movimientobodegadetalleDto, Movimientobodegadetalle.class)
                            ), MovimientobodegadetalleDto.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
}
