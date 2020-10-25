package ch.bfh.lanistae.heroes.service.impl;

import ch.bfh.lanistae.heroes.model.Hero;
import ch.bfh.lanistae.heroes.repository.HeroRepository;
import ch.bfh.lanistae.heroes.service.HeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HeroServiceImpl implements HeroService {

    private static final Logger log = LoggerFactory.getLogger(HeroServiceImpl.class);

    @Autowired
    private HeroRepository heroRepository;

    @Override
    public Hero createHero(String name) {
        log.info("Creating hero with name " + name + "...");
        Hero hero = new Hero();
        hero.setName(name);

        int atk = new Random().nextInt(100);
        hero.setAtk(atk);
        log.info(name + " has ATK value of " + hero.getAtk());

        int def = new Random().nextInt(100);
        hero.setDef(def);
        log.info(name + " has DEF value of " + hero.getDef());

        hero.setHp(100);
        log.info(name + " has HP value of " + hero.getHp());

        String id = heroRepository.save(hero).getId();

        log.info("Hero " + name + " has been created");
        log.info("Heros with ATK greater than50: " + heroRepository.countByAtkGreaterThan(50));
        return heroRepository.findById(id).get();
    }
}
