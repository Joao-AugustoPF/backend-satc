package com.example.exercicio01;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        while(true) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Que ambientação você prefere?\n1. Sci-Fi\n2. Medieval\n");
            int escolha1 = scanner.nextInt();
            System.out.println("Qual gênero você prefere?\n1. Comédia\n2. Drama\n");
            int escolha2 = scanner.nextInt();
    
            if (escolha1 == 1 && escolha2 == 1) {
                System.out.println("Recomendação: Homens de Preto.\n");
            } else if (escolha1 == 1 && escolha2 == 2) {
                System.out.println("Recomendação: Arrival.\n");
            } else if (escolha1 == 2 && escolha2 == 1) {
                System.out.println("Recomendação: Sherk.\n");
            } else if (escolha1 == 2 && escolha2 == 2) {
                System.out.println("Recomendação: Gladiador.\n");
            } else {
                System.out.println("Digite apenas 1 ou 2.\n");
            }
        }


    }
}
