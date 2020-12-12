package ch.bfh.lanistae.promoter.client;

import ch.bfh.lanistae.promoter.model.Party;

import java.util.List;

public interface ArenaClient {
    String battle(List<Party> challangers);
}
