package cl.pocit.services;

import cl.pocit.dto.Tblmovimientobodega;
import cl.pocit.entities.Movimientobodega;
import cl.pocit.repositories.BlInventoryMovBodega;
import cl.pocit.util.MapperUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
public class MovBodegaSrv {
    @Inject
    @RestClient
    BlInventoryMovBodega blInventoryMovBodega;

    public List<Movimientobodega> getById(int id) {
        return MapperUtil.mapList(blInventoryMovBodega.getById(id), Movimientobodega.class);
    }

    public List<Movimientobodega> getByIdBodega(int id) {
        return MapperUtil.mapList(blInventoryMovBodega.getByIdBodega(id), Movimientobodega.class);
    }

    public Movimientobodega save(Movimientobodega movimientobodegadetalle){
        return MapperUtil.map(blInventoryMovBodega.save(
                MapperUtil.map(movimientobodegadetalle, Tblmovimientobodega.class)), Movimientobodega.class);
    }

    public Movimientobodega update(Movimientobodega movimientobodega){
        return MapperUtil.map(blInventoryMovBodega.update(
                MapperUtil.map(movimientobodega, Tblmovimientobodega.class)), Movimientobodega.class);
    }
}
