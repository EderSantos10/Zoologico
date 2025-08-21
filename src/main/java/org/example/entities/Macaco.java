package org.example.entities;

public class Macaco extends Animal {
    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Uu uu aa aa!");
    }
}
