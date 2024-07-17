package cl.pocit.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@Setter
@ToString
public class BodegaDto {
    private Integer id;
    private String codigo;
    private String descripcion;
    private Boolean inventariable = false;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;
}