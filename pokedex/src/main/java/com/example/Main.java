package com.example;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Create and display the Pokedex GUI
        SwingUtilities.invokeLater(() -> new PokedexGUI());
    }
}