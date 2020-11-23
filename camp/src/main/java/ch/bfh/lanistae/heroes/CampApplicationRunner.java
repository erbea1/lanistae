package ch.bfh.lanistae.heroes;

import ch.bfh.lanistae.heroes.repository.HeroRepository;
import ch.bfh.lanistae.heroes.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CampApplicationRunner implements ApplicationRunner {

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private HeroService heroService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (heroRepository.count() == 0) {
            heroService.createHero("Aurelius");
            heroService.createHero("Maximus");
            heroService.createHero("Gladius");
            heroService.createHero("Davidus");
            heroService.createHero("Maximilian");
            heroService.createHero("Cesar");
        }
    }
}
