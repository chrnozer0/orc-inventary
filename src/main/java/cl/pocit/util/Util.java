package cl.pocit.util;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class Util {
    public <T> Response buildOkResponse(T dto) {
        return Response.ok(dto)
                .build();
    }

    public <T> Response buildOkResponse(T dto, Response.Status status) {
        return Response.ok(dto)
                .status(status)
                .build();
    }

    public Response buildNoOkResponse(Response.Status status) {
        return Response.serverError().status(status).build();
    }
}
