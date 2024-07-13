package pocit.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tblproductofilatubos")
public class Tblproductofilatubo {
    @Id
    @Column(name = "idproductofilatubos", nullable = false)
    private Integer id;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "largotubos", nullable = false)
    private Short largotubos;

    @NotNull
    @ColumnDefault("CURRENT_DATE")
    @Column(name = "fechaultimamodificacion", nullable = false)
    private Instant fechaultimamodificacion;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idusuariomodifica", nullable = false)
    private Integer idusuariomodifica;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "filas", nullable = false)
    private Short filas;

}