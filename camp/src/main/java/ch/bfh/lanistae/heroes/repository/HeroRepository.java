package ch.bfh.lanistae.heroes.repository;

import ch.bfh.lanistae.heroes.model.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends CrudRepository<Hero, String> {

    Long countByAtkGreaterThan(Integer atk);
}
