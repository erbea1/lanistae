package ch.bfh.lanistae.heroes.controller;

import ch.bfh.lanistae.heroes.model.Hero;
import ch.bfh.lanistae.heroes.model.Party;
import ch.bfh.lanistae.heroes.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.web.bind.annotation.*;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class PartyController {

    @Autowired
    private PartyService partyService;

    @Autowired
    private RepositoryEntityLinks entityLinks;

    @GetMapping(value = "/createParty")
    public Party createParty(@RequestParam String name) {
        Party party = partyService.createParty(name);
        party.add(linkTo(methodOn(PartyController.class).createParty(name)).withSelfRel());
        for (int i = 0; i < party.getMembers().size(); i++) {
            party.add(entityLinks.linkToItemResource(Hero.class, party.getMembers().get(i).getId()).withRel("hero"+i));
        }
        return party;
    }
}
