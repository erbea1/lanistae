package ch.bfh.lanistae.arena.service.impl;

import ch.bfh.lanistae.arena.model.Party;

public interface BattleService {
    String battle(Party challengeeParty, Party challengerParty);
}
