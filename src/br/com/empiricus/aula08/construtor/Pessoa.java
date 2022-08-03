package br.com.empiricus.aula08.construtor;

public class Pessoa {

    //Declaração de atributos
    private String nome;
    private int idade;

    /*
    Contrutor de classe
    serve para inicializar configurações da classe, para que o objeto não retorne nulo em alguns casos.
     */
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println(this.nome + " - " + this.idade);
    }




}
