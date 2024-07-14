package pocit.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
public class Movimientobodega {
    private Integer id;
    private Integer folio;
    private LocalDate fecha;
    private Integer idbodega;
    private String otro001;
    private String otro002;
    private String otro003;
    private String otro004;
    private Integer idestadomovimientobodega;
    private Instant fecharegistro;
}