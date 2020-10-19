package ch.bfh.lanistae.heroes.service.impl;

import ch.bfh.lanistae.heroes.model.Hero;
import ch.bfh.lanistae.heroes.service.HeroService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HeroServiceImpl implements HeroService {

    @Override
    public Hero createHero(String name) {
        System.out.println("Creating hero with name " + name + "...");
        Hero hero = new Hero();
        hero.setName(name);

        int atk = new Random().nextInt(100);
        hero.setAtk(atk);
        System.out.println(name + " has ATK value of " + hero.getAtk());

        int def = new Random().nextInt(100);
        hero.setDef(def);
        System.out.println(name + " has DEF value of " + hero.getDef());

        hero.setHp(100);
        System.out.println(name + " has HP value of " + hero.getHp());

        System.out.println("Hero " + name + " has been created");
        return hero;
    }
}
