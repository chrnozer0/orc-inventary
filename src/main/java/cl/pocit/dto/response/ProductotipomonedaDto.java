package cl.pocit.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
public class ProductotipomonedaDto {
    private Integer id;
    private Integer idproducto;
    private Short idtipomoneda;
    private LocalDate fecha;
    private BigDecimal valor;
    private Boolean ultimovalor = false;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;

}