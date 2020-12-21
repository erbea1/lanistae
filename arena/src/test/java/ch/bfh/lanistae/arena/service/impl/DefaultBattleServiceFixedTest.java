package ch.bfh.lanistae.arena.service.impl;

import ch.bfh.lanistae.arena.model.Hero;
import ch.bfh.lanistae.arena.model.Party;
import ch.bfh.lanistae.arena.service.impl.impl.DefaultBattleService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultBattleServiceFixedTest {

    @Test
    public void battle() {

        Party challengeeParty = new Party();
        challengeeParty.setName("challengeeParty");

        List<Hero> challengeeMembers = new ArrayList<>();

        Hero challengeeHero0 = new Hero();
        challengeeHero0.setName("challengeeHero0");
        challengeeHero0.setAtk(50);
        challengeeHero0.setDef(50);
        challengeeHero0.setHp(100.0);
        challengeeMembers.add(challengeeHero0);

        Hero challengeeHero1 = new Hero();
        challengeeHero1.setName("challengeeHero1");
        challengeeHero1.setAtk(0);
        challengeeHero1.setDef(100);
        challengeeHero1.setHp(100.0);
        challengeeMembers.add(challengeeHero1);

        Hero challengeeHero2 = new Hero();
        challengeeHero2.setName("challengeeHero2");
        challengeeHero2.setAtk(0);
        challengeeHero2.setDef(0);
        challengeeHero2.setHp(100.0);
        challengeeMembers.add(challengeeHero2);

        Hero challengeeHero3 = new Hero();
        challengeeHero3.setName("challengeeHero3");
        challengeeHero3.setAtk(78);
        challengeeHero3.setDef(34);
        challengeeHero3.setHp(100.0);
        challengeeMembers.add(challengeeHero3);

        challengeeParty.setMembers(challengeeMembers);

        Party challengerParty = new Party();
        challengerParty.setName("challengerParty");

        List<Hero> challengerMembers = new ArrayList<>();

        Hero challengerHero0 = new Hero();
        challengerHero0.setName("challengerHero0");
        challengerHero0.setAtk(50);
        challengerHero0.setDef(50);
        challengerHero0.setHp(100.0);
        challengerMembers.add(challengerHero0);

        Hero challengerHero1 = new Hero();
        challengerHero1.setName("challengerHero1");
        challengerHero1.setAtk(100);
        challengerHero1.setDef(0);
        challengerHero1.setHp(100.0);
        challengerMembers.add(challengerHero1);

        Hero challengerHero2 = new Hero();
        challengerHero2.setName("challengerHero2");
        challengerHero2.setAtk(0);
        challengerHero2.setDef(0);
        challengerHero2.setHp(100.0);
        challengerMembers.add(challengerHero2);

        Hero challengerHero3 = new Hero();
        challengerHero3.setName("challengerHero3");
        challengerHero3.setAtk(82);
        challengerHero3.setDef(45);
        challengerHero3.setHp(100.0);
        challengerMembers.add(challengerHero3);

        challengerParty.setMembers(challengerMembers);


        DefaultBattleService battleService = new DefaultBattleService();
        String winner = battleService.battle(challengeeParty, challengerParty);

        assertEquals(winner, challengerParty.getName());
    }
}
