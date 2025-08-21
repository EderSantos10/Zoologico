package org.example;

public class Macaco extends Animal {

    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Hu Hu Ha Ha!");
    }
}
