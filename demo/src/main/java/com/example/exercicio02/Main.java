package com.example.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Personagem> inimigos = new ArrayList<Personagem>();  
        
        Personagem gobliPersonagem = new Personagem("Goblin", 10, 5);
        Personagem orcPersonagem = new Personagem("Orc", 20, 10);
        Personagem trollPersonagem = new Personagem("Troll", 30, 15);

        inimigos.add(gobliPersonagem);
        inimigos.add(orcPersonagem);
        inimigos.add(trollPersonagem);
        
        Personagem jogador = new Personagem("Jogador", 50, 20);

        while (true) {
            int indiceAleatorio = new Random().nextInt(inimigos.size());
            Personagem inimigo = inimigos.get(indiceAleatorio);

            if(inimigo.vida <= 0) {
                System.out.println(inimigo.nome + " já está morto.");
                System.out.println("Tentando novamente...");
                continue;
            }


            if(inimigo.vida > 0) {
                System.out.println("Jogador atacando " + inimigo.nome);
                jogador.atacar(inimigo);
                System.out.println("Vida do " + inimigo.nome + ": " + inimigo.vida + "\n\n");
                System.out.println("Iniciando ataque em massa...\n\n\n");
                break;
            }
        }

        inimigos.forEach(inimigo -> {
            while (inimigo.vida > 0) {
                System.out.println("Jogador atacando " + inimigo.nome);
                jogador.atacar(inimigo);
                System.out.println("Vida do " + inimigo.nome + ": " + inimigo.vida);

                if (inimigo.vida <= 0) {
                    System.out.println(inimigo.nome + " foi derrotado.");
                } else {
                    System.out.println("Inimigo ainda vivo. Atacando novamente...");
                }
            }
        });

        System.out.println("Todos os inimigos foram derrotados.");

        // while (true) {
        //     if(inimigos.size() == 0) {
        //         System.out.println("Todos os inimigos foram derrotados.");
        //         break;
        //     }

        //     int indiceAleatorio = new Random().nextInt(inimigos.size());
        //     Personagem inimigo = inimigos.get(indiceAleatorio);

        //     if(inimigo.vida > 0) {
        //         System.out.println("Jogador atacando " + inimigo.nome);
        //         jogador.atacar(inimigo);
        //         System.out.println("Vida do " + inimigo.nome + ": " + inimigo.vida + "\n");
        //         if(inimigo.vida <= 0) {
        //             System.out.println(inimigo.nome + " foi derrotado.\n");
        //             inimigos.remove(indiceAleatorio);
        //         }
        //     }


        // }



        

        

    }
}
