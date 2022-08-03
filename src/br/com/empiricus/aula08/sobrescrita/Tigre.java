package br.com.empiricus.aula08.sobrescrita;

public class Tigre extends Animal{

    @Override
    public void comer() {
        System.out.println("Tigre comendo...");
    }

    @Override
    public void somAnimal() {
        System.out.println("Rosnando...");
    }
}
