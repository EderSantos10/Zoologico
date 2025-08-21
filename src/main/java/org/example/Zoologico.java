package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void mostrarAnimais() {
        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}

