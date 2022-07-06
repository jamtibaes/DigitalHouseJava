package br.com.empiricus.aula03;

import java.util.Scanner;

public class EstruturaRepeticaoFor {

    public static void main(String[] args) {

        //Escreva um programa que receba 10 números inteiros e informe quantos deles são pares
        //Usar ternário

        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        for(int i = 0; i < 10; i++) {
            contador += entrada.nextInt() % 2 == 0 ? 1 : 0;
        }
        System.out.printf("%s valores são pares", contador);

        entrada.close();

    }

}
