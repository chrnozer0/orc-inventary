package pocit.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comuna {

    private Integer id;
    private Integer idregion;
    private String descripcion;
    private String codigocomuna;
    private Short diaspermiso;
    private Boolean vigente = false;
}
