package pocit.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoMoneda {
    private Integer id;
    private String descripcion;
    private String simbolo;
    private Short decimales;

}