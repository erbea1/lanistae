package ch.bfh.lanistae.promoter.client;

import ch.bfh.lanistae.promoter.model.Party;
import org.springframework.hateoas.EntityModel;

public interface CampClient {
    EntityModel<Party> createParty(String name);
}
