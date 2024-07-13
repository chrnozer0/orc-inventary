package pocit.resources;


import cl.pocit.dto.response.RegionDto;
import cl.pocit.services.CorporateRegionSrv;
import cl.pocit.util.MapperUtil;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import java.util.List;

@Path("/region")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegionResource {
    @Inject
    CorporateRegionSrv corporateRegionSrv;

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @GET
    @Path("/listar")
    public Response listar() {
        return Response.ok(MapperUtil.mapList(corporateRegionSrv.getRegiones(), RegionDto.class)).build();
    }

    /**
     * Retrieves a list of RegionDto objects based on the given id.
     *
     * @param id The id of the region.
     * @return The list of RegionDto objects.
     */
    @Operation(summary = "Retrieves a list of RegionDto objects based on the given id")
    @APIResponse(responseCode = "200", description = "Retrieves a list of RegionDto objects based on the given id")
    @GET
    @Path("/buscarPorId/{id}")
    public List<RegionDto> getById(@PathParam("id") int id) {
        return MapperUtil.mapList(corporateRegionSrv.getById(id), RegionDto.class);
    }

    /**
     * Guarda una región en la base de datos.
     *
     * @param regionDto El objeto RegionDto que contiene los datos de la región a guardar.
     * @return El objeto RegionDto de la región guardada.
     */
    @Operation(summary = "Guarda una región en la base de datos")
    @APIResponse(responseCode = "200", description = "Guarda una región en la base de datos")
    @POST
    @Path("/guardar")
    public RegionDto guardar(RegionDto regionDto) {
        cl.pocit.entities.Region region = MapperUtil.map(regionDto, cl.pocit.entities.Region.class);
        return MapperUtil.map(corporateRegionSrv.guardar(region), RegionDto.class);
    }

    @Operation(summary = "Actualiza una región en la base de datos")
    @APIResponse(responseCode = "200", description = "Actualiza una región en la base de datos")
    @PUT
    @Path("/actualizar")
    public RegionDto actualizar(RegionDto regionDto) {
        cl.pocit.entities.Region region = MapperUtil.map(regionDto, cl.pocit.entities.Region.class);
        return MapperUtil.map(corporateRegionSrv.actualizar(region), RegionDto.class);
    }

    @Operation(summary = "Actualiza una región en la base de datos")
    @APIResponse(responseCode = "200", description = "Actualiza una región en la base de datos")
    @GET
    @Path("/listarRegionesyComunas")
    public Response getRegionesyComunas() {
        return Response.ok(MapperUtil.mapList(corporateRegionSrv.getRegionesyComunas(), RegionDto.class)).build();
    }
}
