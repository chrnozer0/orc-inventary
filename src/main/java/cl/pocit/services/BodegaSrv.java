package cl.pocit.services;

import cl.pocit.dto.Tblbodega;
import cl.pocit.entities.Bodega;
import cl.pocit.repositories.BlInventoryBodega;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import cl.pocit.util.MapperUtil;

import java.util.List;

@ApplicationScoped
public class BodegaSrv {
    @Inject
    @RestClient
    BlInventoryBodega blInventoryBodega;

    public List<Bodega> getById(int id) {
        return MapperUtil.mapList(blInventoryBodega.getById(id), Bodega.class);
    }
    public List<Bodega> getByName(String name){
        return MapperUtil.mapList(blInventoryBodega.getByName(name), Bodega.class);
    }
    public List<Bodega> list(){
        return MapperUtil.mapList(blInventoryBodega.listar(), Bodega.class);
    }
    public Bodega save(Bodega bodega){
        return MapperUtil.map(blInventoryBodega.save(
                MapperUtil.map(bodega, Tblbodega.class)), Bodega.class);
    }
    public Bodega update(Bodega bodega){
        return MapperUtil.map(blInventoryBodega.update(
                MapperUtil.map(bodega, Tblbodega.class)), Bodega.class);
    }


}
