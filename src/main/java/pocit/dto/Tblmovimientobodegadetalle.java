package pocit.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Tblmovimientobodegadetalle {
   private Integer id;
  private Integer idmovimientobodega;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idproducto", nullable = false)
    private Integer idproducto;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "cantidadingreso", nullable = false, precision = 18, scale = 4)
    private BigDecimal cantidadingreso;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "cantidadegreso", nullable = false, precision = 18, scale = 4)
    private BigDecimal cantidadegreso;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "valorunitario", nullable = false, precision = 18, scale = 4)
    private BigDecimal valorunitario;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "total", nullable = false, precision = 18, scale = 4)
    private BigDecimal total;

}