package pocit.resources;

import cl.pocit.dto.response.ComunaDto;
import cl.pocit.entities.Comuna;
import cl.pocit.services.CorporateComunaSrv;
import cl.pocit.util.MapperUtil;
import cl.pocit.util.Util;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path("/comuna")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ComunaResource {
    @Inject
    CorporateComunaSrv corporateComunaSrv;
    @Inject
    Util util;

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorIdRegion/{id}")
    public Response getByIdRegion(@PathParam("id") int id) {
        try {
            return util.buildOkResponse(corporateComunaSrv.getByIdRegion(id));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ByIdName")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/buscarPorNombre/{nombre}")
    public Response getByIdName(@PathParam("nombre") String descripcion) {
        try {
            return util.buildOkResponse(corporateComunaSrv.getByIdName(descripcion));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "save")
    @APIResponse(responseCode = "200", description = "save")
    @POST
    @Path("/guardar")
    public Response save(ComunaDto objComunaDto) {
        try {
            return util.buildOkResponse(
                    corporateComunaSrv.save(
                            MapperUtil.map(objComunaDto,
                                    Comuna.class)
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "update")
    @APIResponse(responseCode = "200", description = "update")
    @POST
    @Path("/actualizar")
    public Response update(ComunaDto objComunaDto) {
        try {
            return util.buildOkResponse(
                    corporateComunaSrv.update(
                            MapperUtil.map(objComunaDto,
                                    Comuna.class)
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
}
