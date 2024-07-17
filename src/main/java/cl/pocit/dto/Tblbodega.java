package cl.pocit.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class Tblbodega {
    private Integer id;
    private String codigo;
    private String descripcion;
    private Boolean inventariable = false;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;
}