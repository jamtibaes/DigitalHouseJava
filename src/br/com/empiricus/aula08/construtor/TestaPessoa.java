package br.com.empiricus.aula08.construtor;

import java.util.Scanner;

public class TestaPessoa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome = entrada.next();
        int idade = entrada.nextInt();

        //Classe --> objeto --> new Contrutor...
        Pessoa pessoa = new Pessoa(nome, idade);


    }

}
