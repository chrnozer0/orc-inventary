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

@Getter
@Setter
@Entity
@Table(name = "tblproducto_amestandard")
public class TblproductoAmestandard {
    @Id
    @Column(name = "idproducto_amestandard", nullable = false)
    private Integer id;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idproducto", nullable = false)
    private Integer idproducto;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "codigoantiguo", nullable = false, length = 20)
    private String codigoantiguo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "modelo", nullable = false, length = 20)
    private String modelo;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "carcasa_diametro", nullable = false, precision = 10, scale = 4)
    private BigDecimal carcasaDiametro;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "carcasa_diametrointerior", nullable = false, precision = 10, scale = 4)
    private BigDecimal carcasaDiametrointerior;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "carcasa_espesor", nullable = false, precision = 10, scale = 4)
    private BigDecimal carcasaEspesor;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "carcasa_diametroespesor", nullable = false, precision = 10, scale = 4)
    private BigDecimal carcasaDiametroespesor;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "tubos_largonominal", nullable = false, precision = 10, scale = 4)
    private BigDecimal tubosLargonominal;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "tubos_largoefectivo", nullable = false, precision = 10, scale = 4)
    private BigDecimal tubosLargoefectivo;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "tubos_pasos", nullable = false, precision = 10, scale = 4)
    private BigDecimal tubosPasos;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "tubos_numerotubos", nullable = false, precision = 10, scale = 4)
    private BigDecimal tubosNumerotubos;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "espejos_espesor", nullable = false, precision = 10, scale = 4)
    private BigDecimal espejosEspesor;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "espejos_numeropernos", nullable = false, precision = 10, scale = 4)
    private BigDecimal espejosNumeropernos;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "espejos_diametroperno", nullable = false, precision = 10, scale = 4)
    private BigDecimal espejosDiametroperno;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "espejos_diametro", nullable = false, precision = 10, scale = 4)
    private BigDecimal espejosDiametro;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_tipo", nullable = false)
    private Short baflesTipo;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_numero", nullable = false)
    private Short baflesNumero;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espesor", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspesor;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado1_incial11", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado1Incial11;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado1_incial12", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado1Incial12;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado1_central1", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado1Central1;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado1_central2", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado1Central2;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado1_final", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado1Final;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado2_incial11", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado2Incial11;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado2_incial12", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado2Incial12;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado2_central1", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado2Central1;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado2_central2", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado2Central2;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado2_final", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado2Final;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado3_referencia", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado3Referencia;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado3_incial11", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado3Incial11;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado3_incial12", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado3Incial12;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado3_central1", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado3Central1;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado3_central2", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado3Central2;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espaciado3_final", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspaciado3Final;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_diametro", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesDiametro;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_numerotensores", nullable = false)
    private Short baflesNumerotensores;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_diametrotensores", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesDiametrotensores;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_tapas_diametrocabezal", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesTapasDiametrocabezal;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_tapas_espesor", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesTapasEspesor;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_largocaneriacabezal", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesLargocaneriacabezal;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_espesorplacadiv", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesEspesorplacadiv;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "bafles_superficiem2", nullable = false, precision = 10, scale = 4)
    private BigDecimal baflesSuperficiem2;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "boquillas_cabezal_entranda", nullable = false, length = 20)
    private String boquillasCabezalEntranda;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "boquillas_cabezal_salida", nullable = false, length = 20)
    private String boquillasCabezalSalida;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "boquillas_carcasa_entranda", nullable = false, length = 20)
    private String boquillasCarcasaEntranda;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "boquillas_carcasa_salida", nullable = false, length = 20)
    private String boquillasCarcasaSalida;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "cabezal_entrada_codigocabezal", nullable = false, length = 20)
    private String cabezalEntradaCodigocabezal;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "cabezal_entrada_codigobrida", nullable = false, length = 20)
    private String cabezalEntradaCodigobrida;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "cabezal_entrada_codigoempaquetadura", nullable = false, length = 20)
    private String cabezalEntradaCodigoempaquetadura;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "haztubular_codigohaztubular", nullable = false, length = 20)
    private String haztubularCodigohaztubular;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "haztubular_codigoplacatubular", nullable = false, length = 20)
    private String haztubularCodigoplacatubular;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "haztubular_codigocarcasa", nullable = false, length = 20)
    private String haztubularCodigocarcasa;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "haztubular_codigobafle", nullable = false, length = 20)
    private String haztubularCodigobafle;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "haztubular_codigotensor1", nullable = false, length = 20)
    private String haztubularCodigotensor1;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "haztubular_codigotensor2", nullable = false, length = 20)
    private String haztubularCodigotensor2;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "haztubular_distanciador", nullable = false, length = 20)
    private String haztubularDistanciador;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "haztubular_codigoplacatubular2", nullable = false, length = 20)
    private String haztubularCodigoplacatubular2;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "cabezalretorno_empaquetadura", nullable = false, length = 20)
    private String cabezalretornoEmpaquetadura;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "cabezalretorno_brida", nullable = false, length = 20)
    private String cabezalretornoBrida;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "cabezalretorno_cabezal", nullable = false, length = 20)
    private String cabezalretornoCabezal;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "soporte_codigo", nullable = false, length = 20)
    private String soporteCodigo;

}