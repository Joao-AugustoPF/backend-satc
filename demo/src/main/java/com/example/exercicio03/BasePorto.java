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
        barcosAtracados.remove(barco);
    }
}
