package cl.pocit.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class Tblproductolistapreciodetalle {
    private Integer id;
    private Integer idproductolistaprecio;
    private Integer idproducto;
    private BigDecimal valor;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;

}