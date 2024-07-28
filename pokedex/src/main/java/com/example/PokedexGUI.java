package com.example;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PokedexGUI extends JFrame {
    private Pokedex pokedex;
    private JTextField searchField;
    private JList<Pokemon> pokemonList;
    public PokedexGUI() {
        setTitle("Pokedex (30 Pokemon)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        pokedex = new Pokedex(); // Initialize Pokedex
        createComponents(); // Create GUI components
        populatePokemonList(); // Populate the JList with Pokemon
        addListeners(); // Add event listeners
        pack();
        setVisible(true);
    }

    private void createComponents() {
        searchField = new JTextField();
        pokemonList = new JList<>();
        new JLabel();
        new JLabel();
        new JLabel();

        // Set up layout using panels, etc.
    }

    /**
     * 
     */
    private void populatePokemonList() {
        pokedex.getPokemons();
        final DefaultListModel<Pokemon> listModel = new DefaultListModel<>();
        pokemonList.setModel(listModel);
        pokemonList.setSelectedIndex(0); // Select the first Pokemon initially
    }

    private void addListeners() {
        searchField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement search functionality
            }
        });

        pokemonList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    Pokemon pokemon = (Pokemon) pokemonList.getSelectedValue();
                    tampilkanDetailPokemon(pokemon); // Function to display Pokemon details
                }
            }

        });
    }

    private void tampilkanDetailPokemon(Pokemon pokemon) {
        // Implement function to display image, name, and type of Pokemon
    }


}