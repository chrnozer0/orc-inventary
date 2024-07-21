package cl.pocit.services;

import cl.pocit.dto.Tblmovimientobodegadetalle;
import cl.pocit.entities.Movimientobodegadetalle;
import cl.pocit.repositories.BlInventoryMovBodDet;
import cl.pocit.util.MapperUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
public class MovBodDetSrv {

    @Inject
    @RestClient
    BlInventoryMovBodDet blInventoryMovBodDet;

    public List<Movimientobodegadetalle> getById(int id) {
        return MapperUtil.mapList(blInventoryMovBodDet.getById(id), Movimientobodegadetalle.class);
    }

    public List<Movimientobodegadetalle> getByIdMovimientoBodega(int id) {
        return MapperUtil.mapList(blInventoryMovBodDet.getByIdMovimientoBodega(id), Movimientobodegadetalle.class);
    }

    public List<Movimientobodegadetalle> getByIdBodega(int id) {
        return MapperUtil.mapList(blInventoryMovBodDet.getByIdBodega(id), Movimientobodegadetalle.class);
    }

    public List<Movimientobodegadetalle> getByIdProducto(int id) {
        return MapperUtil.mapList(blInventoryMovBodDet.getByIdProducto(id), Movimientobodegadetalle.class);
    }

    public Movimientobodegadetalle save(Movimientobodegadetalle movimientobodegadetalle){
        return MapperUtil.map(blInventoryMovBodDet.save(
                MapperUtil.map(movimientobodegadetalle, Tblmovimientobodegadetalle.class)), Movimientobodegadetalle.class);
    }

    public Movimientobodegadetalle update(Movimientobodegadetalle movimientobodegadetalle){
        return MapperUtil.map(blInventoryMovBodDet.update(
                MapperUtil.map(movimientobodegadetalle, Tblmovimientobodegadetalle.class)), Movimientobodegadetalle.class);
    }
}
