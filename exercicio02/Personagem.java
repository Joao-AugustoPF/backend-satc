package com.example.exercicio02;

public class Personagem {
    public String nome;
    public int vida;
    public int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    void receberDano(int dano) {
        if(this.vida <= 0) {
            System.out.println(this.nome + " morreu.");
            return;
        }

        this.vida -= dano;
    }

    void atacar(Personagem alvo) {
        if(alvo.vida <= 0) {
            System.out.println(alvo.nome + " já está morto.");
            return;
        }

        alvo.receberDano(this.ataque);
    }




            
}