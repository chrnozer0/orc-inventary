package cl.pocit.services;

import cl.pocit.dto.Tblmovimientobodega;
import cl.pocit.dto.Tblorigenproducto;
import cl.pocit.entities.Origenproducto;
import cl.pocit.repositories.BlInventoryOrgnProducto;
import cl.pocit.util.MapperUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
public class OrigenProductoSrv {
    @Inject
    @RestClient
    BlInventoryOrgnProducto blInventoryOrgnProducto;

    public List<Origenproducto> getById(int id) {
        return MapperUtil.mapList(blInventoryOrgnProducto.getById(id),
                Origenproducto.class);
    }

    public List<Origenproducto> getByName(String name) {
        return MapperUtil.mapList(blInventoryOrgnProducto.getByName(name),
                Origenproducto.class);
    }

    public Origenproducto save(Origenproducto movimientobodegadetalle){
        return MapperUtil.map(blInventoryOrgnProducto.save(
                MapperUtil.map(movimientobodegadetalle,
                        Tblorigenproducto.class)),
                Origenproducto.class);
    }

    public Origenproducto update(Origenproducto movimientobodega){
        return MapperUtil.map(blInventoryOrgnProducto.update(
                MapperUtil.map(movimientobodega,
                        Tblorigenproducto.class)),
                Origenproducto.class);
    }
}
