package cl.pocit.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class ProductoDto {
    private Integer id;
    private String codigo;
    private String descripcion;
    private Boolean inventariable = false;
    private Boolean permitircambiodescripcion = false;
    private String oem;
    private Short idunidadmedida;
    private BigDecimal pesounitario;
    private BigDecimal espesor;
    private String nroparteanterior;
    private Short idorigen;
    private Integer idtipoproducto;
    private Boolean material = false;
    private Boolean producto = false;
    private Boolean parte = false;
    private Boolean serviciocontratado = false;
    private Boolean serviciovendido = false;
    private Boolean control = false;
    private Boolean certificado = false;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;
    private Boolean amEstandard = false;
    private Boolean smEstandard = false;
    private Boolean btaEstandard = false;

}