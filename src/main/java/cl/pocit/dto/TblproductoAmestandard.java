package cl.pocit.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TblproductoAmestandard {
    private Integer id;
    private Integer idproducto;
    private String codigoantiguo;
    private String modelo;
    private BigDecimal carcasaDiametro;
    private BigDecimal carcasaDiametrointerior;
    private BigDecimal carcasaEspesor;
    private BigDecimal carcasaDiametroespesor;
    private BigDecimal tubosLargonominal;
    private BigDecimal tubosLargoefectivo;
    private BigDecimal tubosPasos;
    private BigDecimal tubosNumerotubos;
    private BigDecimal espejosEspesor;
    private BigDecimal espejosNumeropernos;
    private BigDecimal espejosDiametroperno;
    private BigDecimal espejosDiametro;
    private Short baflesTipo;
    private Short baflesNumero;
    private BigDecimal baflesEspesor;
    private BigDecimal baflesEspaciado1Incial11;
    private BigDecimal baflesEspaciado1Incial12;
    private BigDecimal baflesEspaciado1Central1;
    private BigDecimal baflesEspaciado1Central2;
    private BigDecimal baflesEspaciado1Final;
    private BigDecimal baflesEspaciado2Incial11;
    private BigDecimal baflesEspaciado2Incial12;
    private BigDecimal baflesEspaciado2Central1;
    private BigDecimal baflesEspaciado2Central2;
    private BigDecimal baflesEspaciado2Final;
    private BigDecimal baflesEspaciado3Referencia;
    private BigDecimal baflesEspaciado3Incial11;
    private BigDecimal baflesEspaciado3Incial12;
    private BigDecimal baflesEspaciado3Central1;
    private BigDecimal baflesEspaciado3Central2;
    private BigDecimal baflesEspaciado3Final;
    private BigDecimal baflesDiametro;
    private Short baflesNumerotensores;
    private BigDecimal baflesDiametrotensores;
    private BigDecimal baflesTapasDiametrocabezal;
    private BigDecimal baflesTapasEspesor;
    private BigDecimal baflesLargocaneriacabezal;
    private BigDecimal baflesEspesorplacadiv;
    private BigDecimal baflesSuperficiem2;
    private String boquillasCabezalEntranda;
    private String boquillasCabezalSalida;
    private String boquillasCarcasaEntranda;
    private String boquillasCarcasaSalida;
    private String cabezalEntradaCodigocabezal;
    private String cabezalEntradaCodigobrida;
    private String cabezalEntradaCodigoempaquetadura;
    private String haztubularCodigohaztubular;
    private String haztubularCodigoplacatubular;
    private String haztubularCodigocarcasa;
    private String haztubularCodigobafle;
    private String haztubularCodigotensor1;
    private String haztubularCodigotensor2;
    private String haztubularDistanciador;
    private String haztubularCodigoplacatubular2;
    private String cabezalretornoEmpaquetadura;
    private String cabezalretornoBrida;
    private String cabezalretornoCabezal;
    private String soporteCodigo;

}