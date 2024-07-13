package pocit.services;

import cl.pocit.dto.Tblregione;
import cl.pocit.entities.Comuna;
import cl.pocit.entities.Region;
import cl.pocit.repositories.BlCorporateComuna;
import cl.pocit.repositories.BlCorporateRegion;
import cl.pocit.util.MapperUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
public class CorporateRegionSrv {

    @Inject
    @RestClient
    BlCorporateRegion blCorporateRegionClient;

    @Inject
    @RestClient
    BlCorporateComuna blCorporateComuna;

    /**
     * Retrieves a list of regions based on the given id.
     *
     * @param id The id of the region.
     * @return The list of regions.
     */
    public List<Region> getById(int id) {
        return MapperUtil.mapList(blCorporateRegionClient.getById(id), Region.class);
    }

    /**
     * Retrieves the list of regions.
     *
     * @return The list of regions.
     */
    public List<Region> getRegiones() {
        return MapperUtil.mapList(blCorporateRegionClient.getRegiones(), Region.class);
    }

    /**
     * Guarda una región en la base de datos.
     *
     * @param region La región a guardar.
     * @return La región guardada.
     */
    public Region guardar(Region region) {
        Tblregione tblregione = MapperUtil.map(region, Tblregione.class);
        return MapperUtil.map(blCorporateRegionClient.guardarRegion(tblregione), Region.class);
    }

    /**
     * Updates a region in the database.
     *
     * @param region The region to update.
     * @return The updated region.
     */
    public Region actualizar(Region region) {
        Tblregione tblregione = MapperUtil.map(region, Tblregione.class);
        return MapperUtil.map(blCorporateRegionClient.actualizar(tblregione), Region.class);
    }


    public List<Region> getRegionesyComunas() {
        List<Region> regions = MapperUtil.mapList(blCorporateRegionClient.getRegiones(), Region.class);
        for (Region objRegion : regions) {
            objRegion.setLstComuna(
                    MapperUtil.mapList(blCorporateComuna.getByIdRegion(objRegion.getId()), Comuna.class)
            );
        }
        return regions;
    }
}
