package pocit.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OrganizacionCondicionesVenta {
    private Integer id;
    private Integer idorganizacion;
    private Integer idvendedor;
    private Short idformapago;
    private String validezoferta;
    private String garantia;
    private String lugarentrega;
    private String plazoentrega;
    private String embalaje;
    private LocalDate fechaultimamodificacion;
    private Integer idusuariomodifica;
}