package cl.pocit.resources;

import cl.pocit.dto.Tblbodega;
import cl.pocit.dto.response.BodegaDto;
import cl.pocit.entities.Bodega;
import cl.pocit.util.MapperUtil;
import cl.pocit.util.Util;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import cl.pocit.services.BodegaSrv;

import java.util.List;

@Path("/comuna")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BodegaResource {
    @Inject
    BodegaSrv bodegaSrv;
    @Inject
    Util util;

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorId/{id}")
    public Response getById(@PathParam("id") int id) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(bodegaSrv.getById(id), Bodega.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorNombre/{nombre}")
    public Response getByName(@PathParam("nombre") String nombre) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            bodegaSrv.getByName(nombre),
                            Bodega.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/listar")
    public Response list(){
        try {
            return util.buildOkResponse(bodegaSrv.list());
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @POST
    @Path("/guardar")
    public Response save(Tblbodega bodega){
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            bodegaSrv.save(
                                    MapperUtil.map(bodega, Bodega.class)
                            ), BodegaDto.class)
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
    public Response update(Tblbodega bodega){
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            bodegaSrv.update(
                                    MapperUtil.map(bodega, Bodega.class)
                            ), BodegaDto.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }


}
