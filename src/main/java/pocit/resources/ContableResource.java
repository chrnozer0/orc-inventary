package pocit.resources;

import cl.pocit.dto.response.TipoDocumentoDto;
import cl.pocit.dto.response.TipoMonedaDto;
import cl.pocit.dto.response.TipoMonedaValorDto;
import cl.pocit.dto.response.UnidadMedidaDto;
import cl.pocit.entities.TipoDocumento;
import cl.pocit.entities.TipoMoneda;
import cl.pocit.entities.TipoMonedaValor;
import cl.pocit.entities.UnidadMedida;
import cl.pocit.services.CorporateContableSrv;
import cl.pocit.util.MapperUtil;
import cl.pocit.util.Util;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path("/contable")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContableResource {
    @Inject
    CorporateContableSrv corporateContableSrv;
    @Inject
    Util util;

    @Operation(summary = "Returns ")
    @APIResponse(responseCode = "200", description = "getByIdTipoDocumento")
    @Path("/getByIdTipoDocumento/{id}")
    @GET
    public Response getByIdTipoDocumento(@PathParam("id") int id) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            corporateContableSrv.getByIdTipodocumento(id),
                            TipoDocumentoDto.class
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipodocumentos")
    @GET
    public Response listarTipoDocumento() {
        try {
            return util.buildOkResponse(MapperUtil.mapList(corporateContableSrv.listarTipoDocumento(), TipoDocumentoDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipodocumentos")
    @POST
    public Response guardarTipoDocumento(TipoDocumentoDto tipoDocumento) {
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            corporateContableSrv.guardarTipoDocumento(
                                    MapperUtil.map(
                                            tipoDocumento,
                                            TipoDocumento.class
                                    )
                            ),
                            TipoDocumentoDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipodocumentos")
    @PUT
    public Response actualizarTipoDocumento(TipoDocumentoDto tipoDocumento) {
        try {
            return util.buildOkResponse(
                    corporateContableSrv.updateTipoDocumento(
                            MapperUtil.map(
                                    tipoDocumento,
                                    TipoDocumento.class
                            )
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipomonedas/{id}")
    @GET
    public Response getByIdTipoMoneda(@PathParam("id") int id) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            corporateContableSrv.getByIdTipoMoneda(id),
                            TipoMonedaDto.class));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipomonedas")
    @GET
    public Response listarTipoMoneda() {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            corporateContableSrv.listarTipoMoneda(),
                            TipoDocumento.class
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipomonedas")
    @POST
    public Response guardarTipoMoneda(TipoMonedaDto tipoMoneda) {
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            corporateContableSrv.guardarTipoMoneda(
                                    MapperUtil.map(
                                            tipoMoneda,
                                            TipoMoneda.class
                                    )
                            ),
                            TipoMonedaDto.class
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipomonedas")
    @PUT
    public Response actualizarTipoMoneda(TipoMonedaDto tipoMoneda) {
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            corporateContableSrv.updateTipoMoneda(
                                    MapperUtil.map(
                                            tipoMoneda,
                                            TipoMoneda.class
                                    ))
                            , TipoDocumentoDto.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/unidadesdemedida/{id}")
    @GET
    public Response getByIdUnidadMedida(@PathParam("id") int id) {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            corporateContableSrv.getByIdUnidadMedida(id),
                            UnidadMedidaDto.class
                    ));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/unidadesdemedida")
    @GET
    public Response listarUnidadMedida() {
        try {
            return util.buildOkResponse(
                    MapperUtil.mapList(
                            corporateContableSrv.listarUnidadMedida(),
                            UnidadMedidaDto.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/unidadesdemedida")
    @POST
    public Response guardarUnidadMedida(UnidadMedidaDto unidadMedida) {
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            corporateContableSrv.guardarUnidadMedida(
                                    MapperUtil.map(
                                            unidadMedida,
                                            UnidadMedida.class
                                    )
                            ),
                            UnidadMedidaDto.class
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/unidadesdemedida")
    @PUT
    public Response actualizarUnidadMedida(UnidadMedidaDto unidadMedida) {
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            corporateContableSrv.updateUnidadMedida(
                                    MapperUtil.map(
                                            unidadMedida,
                                            UnidadMedida.class
                                    )
                            ),
                            UnidadMedidaDto.class
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipomonedavalores/{id}")
    @GET
    public Response getValorByIdTipoMoneda(@PathParam("id") int id) {
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            corporateContableSrv.getValorByIdTipoMoneda(id),
                            TipoMonedaDto.class
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipomonedavalores")
    @POST
    public Response guardarTipoMonedaValor(TipoMonedaValorDto tipoMonedaValor) {
        try {
            return util.buildOkResponse(
                    MapperUtil.map(
                            corporateContableSrv.guardarTipoMonedaValor(
                                    MapperUtil.map(
                                            tipoMonedaValor,
                                            TipoMonedaValor.class
                                    )
                            ),
                            TipoMonedaValorDto.class

                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(summary = "Returns a ComunaByRegion")
    @APIResponse(responseCode = "200", description = "listar comunas")
    @Path("/tipomonedavalores")
    @PUT
    public Response actualizarTipoMonedaValor(TipoMonedaValor tipoMonedaValor) {
        try {
            return util.buildOkResponse(corporateContableSrv.updateTipoMonedaValor(
                    MapperUtil.map(
                            tipoMonedaValor,
                            TipoMonedaValor.class
                    )
            ));
        } catch (Exception e) {
            e.printStackTrace();
            return util.buildNoOkResponse(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
}
