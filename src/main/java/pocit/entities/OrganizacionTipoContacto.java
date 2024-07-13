package pocit.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class OrganizacionTipoContacto {
    private Short id;
    private String descripcion;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;

}