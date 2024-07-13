package pocit.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OrganizacionSucursal {
    private Integer id;
    private Integer idorganizacion;
    private String descripcion;
    private String direccion;
    private Integer idregion;
    private Integer idcomuna;
    private Integer idciudad;
    private Integer idorigen;
    private Boolean cliente = false;
    private Boolean proveedor = false;
    private String observacionescliente;
    private String observacionesproveedor;
    private LocalDate fechaultimamodificacion;
    private Integer idusuariomodifica;

}