package com.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.google.gson.Gson;

public class PokedexApp {
    public static void main(String[] args) {
        try {
            JFrame frame = new JFrame("Pokedex");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            HttpClient client = HttpClient.newHttpClient();
            Gson gson = new Gson();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://pokeapi.co/api/v2/pokemon?limit=30&offset=0"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            Pokemon jsonObject = gson.fromJson(response.body(), Pokemon.class);

            for (PokemonResult result : jsonObject.results) {
                JLabel label = new JLabel("Nama: " + result.name);
                panel.add(label);
            }

            JScrollPane scrollPane = new JScrollPane(panel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            frame.add(scrollPane);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}