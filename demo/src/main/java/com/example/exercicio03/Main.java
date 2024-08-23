package com.example.exercicio03;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crie uma lista contendo 5 barcos com diferentes tamanhos e dois portos (um pequeno e um grande);

        List<Barco> barcos = new ArrayList<Barco>();
        PortoPequeno portoPequeno = new PortoPequeno();
        PortoGrande portoGrande = new PortoGrande();

        Barco barco1 = new Barco();
        barco1.nome = "Barco 1";
        barco1.tamanho = 5;
        barcos.add(barco1);

        Barco barco2 = new Barco();
        barco2.nome = "Barco 2";
        barco2.tamanho = 10;
        barcos.add(barco2);

        Barco barco3 = new Barco();
        barco3.nome = "Barco 3";
        barco3.tamanho = 15;
        barcos.add(barco3);

        Barco barco4 = new Barco();
        barco4.nome = "Barco 4";
        barco4.tamanho = 20;
        barcos.add(barco4);

        Barco barco5 = new Barco();
        barco5.nome = "Barco 5";
        barco5.tamanho = 25;
        barcos.add(barco5);

        // Percorra a lista de barcos e use o método atracarBarco para atracar cada barco em um dos portos;

        // Os barcos devem tentar ser atracados primeiramente no porto pequeno e, se não puderem, 
        // devem ser atracados no porto grande.


        // Atracar os barcos nos portos
        for (Barco barco : barcos) {
            System.out.println("Atracando barco " + barco.nome + " no porto pequeno...");
            portoPequeno.atracarBarco(barco);
            System.out.println("Atracando barco " + barco.nome + " no porto grande...");
            portoGrande.atracarBarco(barco);
        }

        // Desatracar os barcos dos portos
        for (Barco barco : barcos) {
            portoPequeno.desatracarBarco(barco);
            portoGrande.desatracarBarco(barco);
        }
    }
}
