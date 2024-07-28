package com.example;
class Pokemon {
    String nama;
    String tipe;
    String gambarURL; // URL gambar Pokemon
    public PokemonResult[] results;

    public Pokemon(String nama, String tipe, String gambarURL) {
        this.nama = nama;
        this.tipe = tipe;
        this.gambarURL = gambarURL;
    }

    public static Object toArray(Pokemon[] pokemons) {
        return null;
    }

    // Getter dan setter untuk nama, tipe, dan gambarURL
}