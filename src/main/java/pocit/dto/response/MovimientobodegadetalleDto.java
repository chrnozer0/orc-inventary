package pocit.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class MovimientobodegadetalleDto {
  private Integer id;
  private Integer idmovimientobodega;
  private Integer idproducto;
  private BigDecimal cantidadingreso;
  private BigDecimal cantidadegreso;
  private BigDecimal valorunitario;
  private BigDecimal total;

}