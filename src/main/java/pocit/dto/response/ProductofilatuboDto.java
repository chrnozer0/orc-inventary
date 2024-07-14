package pocit.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ProductofilatuboDto {
    private Integer id;
    private Short largotubos;
    private Instant fechaultimamodificacion;
    private Integer idusuariomodifica;
    private Short filas;

}