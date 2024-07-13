package pocit.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Region {
    private int id;
    private String descripcion;
    private String codigoregion;
    private List<Comuna> lstComuna;
}
