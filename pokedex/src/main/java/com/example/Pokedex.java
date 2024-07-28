package com.example;
import java.util.ArrayList;
import java.util.List;

class Pokedex {
    private List<Pokemon> pokemons;

    public Pokedex() {
        pokemons = new ArrayList<>();
        buatDaftarPokemon(); // Buat daftar Pokemon
    }

    private void buatDaftarPokemon() {
        pokemons.add(new Pokemon("Bulbasaur", "Rumput/Racun", "https://cdn.pixabay.com/photo/2018/04/13/16/13/pixel-3316924_1280.png"));
        pokemons.add(new Pokemon("Charmander", "Api", "https://cdn.pixabay.com/photo/2021/12/26/17/31/pokemon-6895600_1280.png"));
        pokemons.add(new Pokemon("Squirtle", "Air", "https://static.wikia.nocookie.net/pokemon/images/5/54/0007Squirtle.png/revision/latest?cb=20240714154016"));
        pokemons.add(new Pokemon("Pikachu", "Elektrik", "https://cdn.pixabay.com/photo/2020/07/21/16/10/pokemon-5426712_1280.png"));
        pokemons.add(new Pokemon("Sandslash", "Tanah", "https://static.wikia.nocookie.net/pokemon/images/a/a4/0028Sandslash.png/revision/latest/scale-to-width-down/1000?cb=20240714164948"));
    }

    // Getter untuk daftar Pokemon
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    // Metode untuk pencarian, filter, dll. (implementasikan sesuai kebutuhan)
}