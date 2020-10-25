package ch.bfh.lanistae.heroes.service.impl;

import ch.bfh.lanistae.heroes.model.Hero;
import ch.bfh.lanistae.heroes.model.Party;
import ch.bfh.lanistae.heroes.service.HeroService;
import ch.bfh.lanistae.heroes.service.PartyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartyServiceImpl implements PartyService {

    private static final Logger log = LoggerFactory.getLogger(PartyServiceImpl.class);

    @Autowired
    private HeroService heroService;

    public Party createParty(String name) {
        log.info("Creating party with name " + name + "...");
        Party party = new Party();
        party.setName(name);
        List<Hero> members = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            members.add(heroService.createHero("Hero" + i));
        }
        log.info("Adding heroes to party " + name);
        party.setMembers(members);
        log.info("Party " + name + " has been created.");
        return party;
    }
}
