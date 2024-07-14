package pocit.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class GrupoDto {
    private Integer id;
    private String descripcion;
    private String nomenclatura;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;
}