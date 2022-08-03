package br.com.empiricus.aula08.sobrescrita;

public class Cachorro extends Animal{

    @Override //sobrescrita de método
    public void comer() {
        System.out.println("Cachorro comendo...");
    }



}
