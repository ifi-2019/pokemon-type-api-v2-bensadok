package main.service;

import main.bo.PokemonType;

import java.util.List;

public interface PokemonTypeService {
    PokemonType getPokemonType(int id);
    PokemonType getPokemonTypeFromName(String name);
    List<PokemonType> getAllPokemonTypes();
}
