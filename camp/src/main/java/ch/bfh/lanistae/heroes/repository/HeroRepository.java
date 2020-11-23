package ch.bfh.lanistae.heroes.repository;

import ch.bfh.lanistae.heroes.model.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface HeroRepository extends CrudRepository<Hero, String> {

    Long countByAtkGreaterThan(Integer atk);
}
