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

@Getter
@Setter
@Entity
@Table(name = "tblproducto_btaestandard")
public class TblproductoBtaestandard {
    @Id
    @Column(name = "idproducto_btaestandard", nullable = false)
    private Integer id;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idproducto", nullable = false)
    private Integer idproducto;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idproductofilatubos", nullable = false)
    private Integer idproductofilatubos;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "tubosfila", nullable = false)
    private Short tubosfila;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "colectorsup_codigo", nullable = false, length = 20)
    private String colectorsupCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "colectorinf_codigo", nullable = false, length = 20)
    private String colectorinfCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "estanquesup_codigo", nullable = false, length = 20)
    private String estanquesupCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "mediacanasup_codigo", nullable = false, length = 20)
    private String mediacanasupCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "caneriaconexionsup_codigo", nullable = false, length = 20)
    private String caneriaconexionsupCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "tapasup_codigo", nullable = false, length = 20)
    private String tapasupCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "estanqueinf_codigo", nullable = false, length = 20)
    private String estanqueinfCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "mediacanainf_codigo", nullable = false, length = 20)
    private String mediacanainfCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "caneriaconexioninf_codigo", nullable = false, length = 20)
    private String caneriaconexioninfCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "tapainf_codigo", nullable = false, length = 20)
    private String tapainfCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "dobleestanque_codigo", nullable = false, length = 20)
    private String dobleestanqueCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "canal_codigo", nullable = false, length = 20)
    private String canalCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "angulos_codigo", nullable = false, length = 20)
    private String angulosCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "flanjeespprensa_codigo", nullable = false, length = 20)
    private String flanjeespprensaCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "escuadra_codigo", nullable = false, length = 20)
    private String escuadraCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "canalescuadra_codigo", nullable = false, length = 20)
    private String canalescuadraCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "atiezador_codigo", nullable = false, length = 20)
    private String atiezadorCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "hazdetubos_codigo", nullable = false, length = 20)
    private String hazdetubosCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "tensor_codigo", nullable = false, length = 20)
    private String tensorCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "contraflanjeprensa_codigo", nullable = false, length = 20)
    private String contraflanjeprensaCodigo;

    @Size(max = 20)
    @NotNull
    @ColumnDefault("")
    @Column(name = "haztubosconcabezales_codigo", nullable = false, length = 20)
    private String haztubosconcabezalesCodigo;

}