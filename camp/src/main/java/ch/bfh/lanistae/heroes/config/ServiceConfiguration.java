package ch.bfh.lanistae.heroes.config;

import ch.bfh.lanistae.heroes.service.HeroService;
import ch.bfh.lanistae.heroes.service.PartyService;
import ch.bfh.lanistae.heroes.service.impl.HeroServiceImpl;
import ch.bfh.lanistae.heroes.service.impl.PartyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public HeroService heroService() {
        return new HeroServiceImpl();
    }

    @Bean
    public PartyService partyService() {
        return new PartyServiceImpl();
    }
}