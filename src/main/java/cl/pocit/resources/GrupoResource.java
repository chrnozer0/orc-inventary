package cl.pocit.resources;

import cl.pocit.dto.response.GrupoDto;
import cl.pocit.entities.Grupo;
import cl.pocit.services.GrupoSrv;
import cl.pocit.util.MapperUtil;
import cl.pocit.util.Util;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path("/grupo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GrupoResource {
    @Inject
    Util util;
    @Inject
    GrupoSrv grupoSrv;

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorId/{id}")
    public Response getById(@PathParam("id") int id) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(grupoSrv.getById(id), Grupo.class));
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
                            grupoSrv.getByName(nombre),
                            Grupo.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @POST
    @Path("/guardar")
    public Response save(GrupoDto grupoDto){
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            grupoSrv.save(
                                    MapperUtil.map(grupoDto, Grupo.class)
                            ), GrupoDto.class)
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
    public Response update(GrupoDto grupoDto){
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            grupoSrv.update(
                                    MapperUtil.map(grupoDto, Grupo.class)
                            ), GrupoDto.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
}
