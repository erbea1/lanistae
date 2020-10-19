package ch.bfh.lanistae.heroes;

import ch.bfh.lanistae.heroes.config.ServiceConfiguration;
import ch.bfh.lanistae.heroes.service.PartyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        // Application context using annotations for DI - more magic, less control
        AnnotationConfigApplicationContext annotatedContext = new AnnotationConfigApplicationContext();
        annotatedContext.scan("ch.bfh.lanistae.heroes.service.impl");
        annotatedContext.refresh();

        PartyService partyServiceAnnotaded = annotatedContext.getBean(PartyService.class);
        partyServiceAnnotaded.createParty("Party1");

        annotatedContext.close();

        // Application context using java configuration for DI - less magic, more control, @Service annotations are obsolete.
        AnnotationConfigApplicationContext configuredContext = new AnnotationConfigApplicationContext(ServiceConfiguration.class);

        PartyService partyServiceConfigured = configuredContext.getBean(PartyService.class);
        partyServiceConfigured.createParty("Party2");

        configuredContext.close();
    }
}
