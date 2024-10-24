package com.example.exercicio03;

public class PortoGrande extends BasePorto {
    
    @Override
    public void atracarBarco(Barco barco) {
        if(barco.tamanho >= 10) {
            System.out.println("Barco " + barco.nome + " atracado com sucesso.\n");

            if(barcosAtracados.contains(barco)) {
                System.out.println("O barco " + barco.nome + " já está atracado.\n");
                return;
            }

            barcosAtracados.add(barco);
            System.out.println("O barco " + barco.nome + " foi atracado com sucesso.\n");
        } else {
            System.out.println("O tamanho do barco " + barco.nome + " é menor que o valor mínimo suportado.\n");
        }
    }
}
