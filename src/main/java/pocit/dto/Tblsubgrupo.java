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

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tblsubgrupo")
public class Tblsubgrupo {
    @Id
    @Column(name = "idsubgrupo", nullable = false)
    private Integer id;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idgrupo", nullable = false)
    private Integer idgrupo;

    @Size(max = 50)
    @NotNull
    @ColumnDefault("")
    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;

    @Size(max = 10)
    @NotNull
    @ColumnDefault("")
    @Column(name = "nomenclatura", nullable = false, length = 10)
    private String nomenclatura;

    @NotNull
    @ColumnDefault("CURRENT_DATE")
    @Column(name = "fechaultimamodificacion", nullable = false)
    private Instant fechaultimamodificacion;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "idusuariomodifica", nullable = false)
    private Integer idusuariomodifica;

}