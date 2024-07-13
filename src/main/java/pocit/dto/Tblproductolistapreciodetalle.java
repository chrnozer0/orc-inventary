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

@Getter
@Setter
@Entity
@Table(name = "tblproductolistapreciodetalle")
public class Tblproductolistapreciodetalle {
    @Id
    @Column(name = "idproductolistapreciodetalle", nullable = false)
    private Integer id;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idproductolistaprecio", nullable = false)
    private Integer idproductolistaprecio;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idproducto", nullable = false)
    private Integer idproducto;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "valor", nullable = false, precision = 18, scale = 4)
    private BigDecimal valor;

    @NotNull
    @ColumnDefault("CURRENT_DATE")
    @Column(name = "fechaultimamodificacion", nullable = false)
    private Instant fechaultimamodificacion;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idusuariomodifica", nullable = false)
    private Integer idusuariomodifica;

}