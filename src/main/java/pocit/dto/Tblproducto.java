package pocit.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tblproducto")
public class Tblproducto {
    @Id
    @Column(name = "idproducto", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "codigo", nullable = false, length = 20)
    private String codigo;

    @Size(max = 50)
    @NotNull
    @ColumnDefault("")
    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "inventariable", nullable = false)
    private Boolean inventariable = false;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "permitircambiodescripcion", nullable = false)
    private Boolean permitircambiodescripcion = false;

    @Size(max = 50)
    @NotNull
    @ColumnDefault("")
    @Column(name = "oem", nullable = false, length = 50)
    private String oem;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idunidadmedida", nullable = false)
    private Short idunidadmedida;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "pesounitario", nullable = false, precision = 18, scale = 4)
    private BigDecimal pesounitario;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "espesor", nullable = false, precision = 18, scale = 4)
    private BigDecimal espesor;

    @Size(max = 10)
    @NotNull
    @ColumnDefault("")
    @Column(name = "nroparteanterior", nullable = false, length = 10)
    private String nroparteanterior;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idorigen", nullable = false)
    private Short idorigen;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idtipoproducto", nullable = false)
    private Integer idtipoproducto;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "material", nullable = false)
    private Boolean material = false;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "producto", nullable = false)
    private Boolean producto = false;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "parte", nullable = false)
    private Boolean parte = false;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "serviciocontratado", nullable = false)
    private Boolean serviciocontratado = false;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "serviciovendido", nullable = false)
    private Boolean serviciovendido = false;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "control", nullable = false)
    private Boolean control = false;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "certificado", nullable = false)
    private Boolean certificado = false;

    @NotNull
    @ColumnDefault("CURRENT_DATE")
    @Column(name = "fechaultimamodificacion", nullable = false)
    private Instant fechaultimamodificacion;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idusuariomodifica", nullable = false)
    private Integer idusuariomodifica;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "\"AM_Estandard\"", nullable = false)
    private Boolean amEstandard = false;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "\"SM_Estandard\"", nullable = false)
    private Boolean smEstandard = false;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "\"BTA_Estandard\"", nullable = false)
    private Boolean btaEstandard = false;

}