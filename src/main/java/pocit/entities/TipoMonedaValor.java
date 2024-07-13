package pocit.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class TipoMonedaValor {
    private Integer id;
    private Integer idtipomoneda;
    private LocalDate fecha;
    private BigDecimal valor;

}