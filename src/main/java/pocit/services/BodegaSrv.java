package pocit.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import pocit.repositories.BlInventoryBodega;

@ApplicationScoped
public class BodegaSrv {
    @Inject
    @RestClient
    BlInventoryBodega blInventoryBodega;



}
