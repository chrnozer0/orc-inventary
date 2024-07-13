package pocit.services;

import cl.pocit.dto.Tblcomuna;
import cl.pocit.entities.Comuna;
import cl.pocit.repositories.BlCorporateComuna;
import cl.pocit.util.MapperUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
public class CorporateComunaSrv {

    @Inject
    @RestClient
    BlCorporateComuna blCorporateComuna;

    public List<Comuna> getByIdRegion(int id) {
        return MapperUtil.mapList(blCorporateComuna.getByIdRegion(id), Comuna.class);
    }
    public List<Comuna> getByIdName(String descripcion){
        return MapperUtil.mapList(blCorporateComuna.getByIdName(descripcion),Comuna.class);
    }
    public Comuna save(Comuna comuna){
        return MapperUtil.map(
          blCorporateComuna.save(
                  MapperUtil.map(comuna, Tblcomuna.class)
          ),Comuna.class
        );
    }
    public Comuna update(Comuna comuna){
        return MapperUtil.map(
                blCorporateComuna.update(
                        MapperUtil.map(comuna, Tblcomuna.class)
                ),Comuna.class
        );
    }
}
