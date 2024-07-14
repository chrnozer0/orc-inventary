package pocit.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class Tblorigenproducto {
    private Short id;
    private String descripcion;
    private String nomenclatura;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;
}