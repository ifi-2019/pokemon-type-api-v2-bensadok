package main.controller;

import main.bo.PokemonType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import main.service.PokemonTypeService;

import java.util.List;

@RestController
@RequestMapping("/pokemon-types")
class PokemonTypeController {
    public PokemonTypeService pokemonTypeService;

    public PokemonTypeController(PokemonTypeService pokemonTypeService) {
        this.pokemonTypeService = pokemonTypeService;
    }

    @GetMapping("/{id}")
    PokemonType getPokemonTypeFromId(@PathVariable int id){
        return this.pokemonTypeService.getPokemonType(id);
    }

    @GetMapping(value = "/",params = "name")
    public PokemonType getPokemonTypeFromName(String name){
        return this.pokemonTypeService.getPokemonTypeFromName(name);
    }

    @GetMapping("/")
    public List<PokemonType> getAllPokemonTypes() {
        return this.pokemonTypeService.getAllPokemonTypes();
    }
}