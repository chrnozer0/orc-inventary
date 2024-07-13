package pocit.services;

import cl.pocit.repositories.BlCorporateOrganizacion;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class CorporateOrganizacionSrv {
    @Inject
    @RestClient
    BlCorporateOrganizacion blCorporateOrganizacion;

    /*public List<Tblorganizacion> getByIdTipodocumento() {
        return MapperUtil.mapList(blCorporateOrganizacion.getByRazonSocial(id), Tblorganizacion.class);
    }*/


}
