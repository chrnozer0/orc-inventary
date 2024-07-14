package pocit.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ProductolistaprecioDto {
    private Integer id;
    private String descripcion;
    private String nomenclatura;
    private Integer idtipomoneda;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;

}