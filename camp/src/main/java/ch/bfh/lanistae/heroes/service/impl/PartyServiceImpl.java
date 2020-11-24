package ch.bfh.lanistae.heroes.service.impl;

import ch.bfh.lanistae.heroes.model.Hero;
import ch.bfh.lanistae.heroes.model.Party;
import ch.bfh.lanistae.heroes.repository.HeroRepository;
import ch.bfh.lanistae.heroes.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PartyServiceImpl implements PartyService {

    @Autowired
    private HeroRepository heroRepository;

    public Party createParty(String name) {
        System.out.println("Creating party with name " + name + "...");

        Party party = new Party();
        party.setName(name);

        List<Hero> allHeroes = (List<Hero>) heroRepository.findAll();
        Collections.shuffle(allHeroes);
        List<Hero> randomHeroes = new ArrayList<>(allHeroes.subList(0, 4));

        System.out.println("Adding heroes to party " + name);
        party.setMembers(randomHeroes);
        System.out.println("Party " + name + " has been created.");
        return party;
    }
}
