package br.com.empiricus.aula03;

import java.util.Scanner;

public class EstruturaCondicionalIfElse {

    public static void main(String[] args) {
        //1. Faça um programa que receba três inteiros e diga qual deles é o maior.

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        int valor1 = entrada.nextInt();

        System.out.print("Digite o valor 2: ");
        int valor2 = entrada.nextInt();

        System.out.print("Digite o valor 3: ");
        int valor3 = entrada.nextInt();


        if(valor1 >= valor2 && valor1 >= valor3){
            System.out.println("O primeiro valor é maior!");
        } else if(valor2 > valor1 && valor2 > valor3) {
            System.out.println("O segundo valor é maior");
        } else if(valor3 > valor1 && valor3 > valor2) {
            System.out.println("O terceiro valor é maior");
        } else {
            System.out.println("Existem valores repetidos");
        }

    }

}
