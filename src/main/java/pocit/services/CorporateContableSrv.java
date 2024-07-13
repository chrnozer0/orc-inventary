package pocit.services;

import cl.pocit.dto.Tbltipodocumento;
import cl.pocit.dto.Tbltipomoneda;
import cl.pocit.dto.Tbltipomonedavalor;
import cl.pocit.dto.Tblunidadmedida;
import cl.pocit.entities.TipoDocumento;
import cl.pocit.entities.TipoMoneda;
import cl.pocit.entities.TipoMonedaValor;
import cl.pocit.entities.UnidadMedida;
import cl.pocit.repositories.BlCorporateContable;
import cl.pocit.util.MapperUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

/**
 * This class is responsible for providing the corporate contable services.
 */
@ApplicationScoped
public class CorporateContableSrv {
    @Inject
    @RestClient
    BlCorporateContable blCorporateContable;

    //tipo documento

    /**
     * Retrieves a list of TipoDocumento objects by their ID.
     *
     * @param id The ID of the TipoDocumento objects to retrieve.
     * @return A list of mapped TipoDocumento objects.
     */
    public List<TipoDocumento> getByIdTipodocumento(int id) {
        return MapperUtil.mapList(blCorporateContable.getByIdTipodocumento(id), TipoDocumento.class);
    }

    /**
     * Returns a list of TipoDocumento objects.
     *
     * @return a list of TipoDocumento objects
     */
    public List<TipoDocumento> listarTipoDocumento() {
        return MapperUtil.mapList(blCorporateContable.listarTipoMoneda(), TipoDocumento.class);
    }

    /**
     * Saves a TipoDocumento object.
     *
     * @param tipodocumento The TipoDocumento object to be saved.
     * @return The saved TipoDocumento object.
     */
    public TipoDocumento guardarTipoDocumento(TipoDocumento tipodocumento) {
        return MapperUtil.map(
                blCorporateContable.guardarTipoDocumento(
                        MapperUtil.map(tipodocumento, Tbltipodocumento.class))
                , TipoDocumento.class
        );
    }

    /**
     * Updates the specified TipoDocumento.
     *
     * @param tipodocumento the TipoDocumento object to be updated
     * @return the updated TipoDocumento object
     */
    public TipoDocumento updateTipoDocumento(TipoDocumento tipodocumento) {
        return MapperUtil.map(blCorporateContable.updateTipoDocumento(MapperUtil.map(tipodocumento, Tbltipodocumento.class)), TipoDocumento.class);
    }

    //tipo de moneda

    /**
     * Retrieves a list of TipoMoneda objects by their id.
     *
     * @param id The id of the TipoMoneda objects to retrieve.
     * @return A list of TipoMoneda objects.
     */
    public List<TipoMoneda> getByIdTipoMoneda(int id) {
        return MapperUtil.mapList(blCorporateContable.getByIdTipoMoneda(id), TipoMoneda.class);
    }

    /**
     * Retrieves a list of TipoMoneda objects.
     *
     * @return A list of TipoMoneda objects.
     */
    public List<TipoMoneda> listarTipoMoneda() {
        return MapperUtil.mapList(blCorporateContable.listarTipoMoneda(), TipoMoneda.class);
    }

    /**
     * Save the given TipoMoneda.
     *
     * @param tipoMoneda The TipoMoneda to be saved.
     * @return The saved TipoMoneda.
     */
    public TipoMoneda guardarTipoMoneda(TipoMoneda tipoMoneda) {
        return MapperUtil.map(blCorporateContable.guardarTipoMoneda(MapperUtil.map(tipoMoneda, Tbltipomoneda.class)), TipoMoneda.class);
    }

    /**
     * Updates the TipoMoneda entity.
     *
     * @param tipoMoneda the TipoMoneda object to update
     * @return the updated TipoMoneda object
     */
    public TipoMoneda updateTipoMoneda(TipoMoneda tipoMoneda) {
        return MapperUtil.map(blCorporateContable.updateTipoMoneda(MapperUtil.map(tipoMoneda, Tbltipomoneda.class)), TipoMoneda.class);
    }

    /**
     * Retrieves a list of UnidadMedida objects by their ID.
     *
     * @param id The ID of the UnidadMedida objects to retrieve
     * @return A list of UnidadMedida objects matching the given ID
     */
//unidad medida
    public List<UnidadMedida> getByIdUnidadMedida(int id) {
        return MapperUtil.mapList(blCorporateContable.getByIdUnidadMedida(id), UnidadMedida.class);
    }

    /**
     * Retrieves a list of UnidadMedida objects by calling the listarUnidadMedida method of BlCorporateContable.
     *
     * @return A list of UnidadMedida objects.
     */
    public List<UnidadMedida> listarUnidadMedida() {
        return MapperUtil.mapList(blCorporateContable.listarUnidadMedida(), UnidadMedida.class);
    }

    /**
     * Saves a Unit of Measurement.
     *
     * @param unidadmedida The Unit of Measurement to be saved.
     * @return The saved Unit of Measurement.
     */
    public UnidadMedida guardarUnidadMedida(UnidadMedida unidadmedida) {
        return MapperUtil.map(blCorporateContable.guardarUnidadMedida(MapperUtil.map(unidadmedida, Tblunidadmedida.class)), UnidadMedida.class);
    }

    /**
     * Updates an instance of UnidadMedida.
     *
     * @param unidadmedida The UnidadMedida instance to update.
     * @return The updated UnidadMedida instance.
     */
    public UnidadMedida updateUnidadMedida(UnidadMedida unidadmedida) {
        return MapperUtil.map(blCorporateContable.updateUnidadMedida(MapperUtil.map(unidadmedida, Tblunidadmedida.class)), UnidadMedida.class);
    }

    /**
     * Retrieves a list of TipoMonedaValor objects by their TipoMoneda ID.
     *
     * @param id the ID of the TipoMoneda
     * @return a list of TipoMonedaValor objects mapped from the retrieved data
     */
//tipo moneda valor
    public List<TipoMonedaValor> getValorByIdTipoMoneda(int id) {
        return MapperUtil.mapList(blCorporateContable.getValorByIdTipoMoneda(id), TipoMonedaValor.class);
    }

    /**
     * Guardar el TipoMonedaValor en la base de datos.
     *
     * @param tipomonedavalor El objeto TipoMonedaValor a guardar.
     * @return El TipoMonedaValor guardado.
     */
    public TipoMonedaValor guardarTipoMonedaValor(TipoMonedaValor tipomonedavalor) {
        return MapperUtil.map(blCorporateContable.guardarTipoMonedaValor(MapperUtil.map(tipomonedavalor, Tbltipomonedavalor.class)), TipoMonedaValor.class);
    }

    /**
     * Updates a TipoMonedaValor object.
     *
     * @param tipomonedavalor The TipoMonedaValor object to be updated
     * @return The updated TipoMonedaValor object
     */
    public TipoMonedaValor updateTipoMonedaValor(TipoMonedaValor tipomonedavalor) {
        return MapperUtil.map(blCorporateContable.updateTipoMonedaValor(MapperUtil.map(tipomonedavalor, Tbltipomonedavalor.class)), TipoMonedaValor.class);
    }
}
