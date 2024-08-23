package com.example.exercicio03;

public class PortoGrande extends BasePorto {
    
    @Override
    public void atracarBarco(Barco barco) {
        if(barco.tamanho >= 10) {
            barcosAtracados.add(barco);
            System.out.println("Barco " + barco.nome + " atracado com sucesso.\n");
        } else {
            System.out.println("O tamanho do barco é menor que o mínimo do porto.\n");
        }
    }
    
}
