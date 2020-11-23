package ch.bfh.lanistae.heroes.controller;

import ch.bfh.lanistae.heroes.model.Hero;
import ch.bfh.lanistae.heroes.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/heroesWOHateoas")
public class HeroController {

    @Autowired
    private HeroRepository heroRepository;

    @GetMapping
    public @ResponseBody Iterable<Hero> getAll() {
        return heroRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Hero getById(@PathVariable String id) {
        return heroRepository.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Hero hero) {
        heroRepository.save(hero);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id) {
        heroRepository.deleteById(id);
    }
}
