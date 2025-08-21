package org.example;

import org.example.entities.Leao;
import org.example.entities.Macaco;
import org.example.entities.Zoologico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.adicionarAnimal(new Leao("Leão"));
        zoo.adicionarAnimal(new Macaco("Macaco"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do animal para ouvir o som (Leão/Macaco): ");
        String escolha = scanner.nextLine();

        switch (escolha.toLowerCase()) {
            case "leão":
            case "leao":
                new Leao("Leão").emitirSom();
                break;
            case "macaco":
                new Macaco("Macaco").emitirSom();
                break;
            default:
                System.out.println("Animal não encontrado no zoológico.");
        }

        scanner.close();
    }
}
