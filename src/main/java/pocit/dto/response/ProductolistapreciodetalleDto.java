package pocit.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class ProductolistapreciodetalleDto {
    private Integer id;
    private Integer idproductolistaprecio;
    private Integer idproducto;
    private BigDecimal valor;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;

}