package cl.pocit.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@Setter
@ToString
public class Bodega {
    private Integer id;
    private String codigo;
    private String descripcion;
    private Boolean inventariable = false;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;
}