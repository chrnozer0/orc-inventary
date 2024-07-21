package cl.pocit.services;

import cl.pocit.dto.Tblgrupo;
import cl.pocit.entities.Grupo;
import cl.pocit.repositories.BlInventoryGrupo;
import cl.pocit.util.MapperUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
public class GrupoSrv {
    @Inject
    @RestClient
    BlInventoryGrupo blInventoryGrupo;

    /**
     * listar grupo por id
     * @param id
     * @return List<Grupo>
     */
    public List<Grupo> getById(int id) {
        return MapperUtil.mapList(blInventoryGrupo.getById(id), Grupo.class);
    }
    public List<Grupo> getByName(String nomnbre) {
        return MapperUtil.mapList(blInventoryGrupo.getByName(nomnbre), Grupo.class);
    }
    public Grupo save(Grupo grupo){
        return MapperUtil.map(blInventoryGrupo.save(
                MapperUtil.map(grupo, Tblgrupo.class)), Grupo.class);
    }
    public Grupo update(Grupo grupo){
        return MapperUtil.map(blInventoryGrupo.save(
                MapperUtil.map(grupo, Tblgrupo.class)), Grupo.class);
    }

}
