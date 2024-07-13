package pocit.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Organizacion {
    private Integer id;
    private String rut;
    private String razonsocial;
    private String nombrefantasia;
    private String direccion;
    private Integer idregion;
    private Integer idcomuna;
    private Integer idciudad;
    private Integer idorigen;
    private Boolean cliente = false;
    private Boolean proveedor = false;
    private String observacionescliente;
    private String observacionesproveedor;
    private Integer idorganizacionrubro;
    private LocalDate fechaultimamodificacion;
    private Integer idusuariomodifica;
}