package pocit.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class OrganizacionContacto {
    private Integer id;
    private Integer idorganizacion;
    private Short idorganizaciontipocontacto;
    private String nombre;
    private String email;
    private String fonofijo;
    private String celular;
    private String cargo;
    private String observaciones;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;
}