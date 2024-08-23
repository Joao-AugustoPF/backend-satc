package com.example.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    public String nome;
    public List<Barco> barcosAtracados = new ArrayList<Barco>();

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
    }

    public void desatracarBarco(Barco barco) {
        if (barcosAtracados.contains(barco)) {
            System.out.println("Desatracando o barco: " + barco.nome);
            barcosAtracados.remove(barco);
        } else {
            System.out.println("O barco " + barco.nome + " não está atracado.");
        }

                String[] nomesDosBarcos = new String[barcosAtracados.size()];

        for (int i = 0; i < barcosAtracados.size(); i++) {
            nomesDosBarcos[i] = barcosAtracados.get(i).nome;
        }

        if(nomesDosBarcos.length == 0) {
            System.out.println("Barcos Atracados: Nenhum.\n");
            return;
        }

        System.out.println("Barcos Atracados: " + String.join(", ", nomesDosBarcos) + "\n");
    }

}
