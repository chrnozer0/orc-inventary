package pocit.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tblproductotipomoneda")
public class Tblproductotipomoneda {
    @Id
    @Column(name = "idproductomoneda", nullable = false)
    private Integer id;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idproducto", nullable = false)
    private Integer idproducto;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idtipomoneda", nullable = false)
    private Short idtipomoneda;

    @NotNull
    @ColumnDefault("CURRENT_DATE")
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "valor", nullable = false, precision = 18, scale = 4)
    private BigDecimal valor;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "ultimovalor", nullable = false)
    private Boolean ultimovalor = false;

    @NotNull
    @ColumnDefault("CURRENT_DATE")
    @Column(name = "fechaultimamodificacion", nullable = false)
    private Instant fechaultimamodificacion;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idusuariomodifica", nullable = false)
    private Integer idusuariomodifica;

}