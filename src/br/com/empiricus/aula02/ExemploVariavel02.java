package br.com.empiricus.aula02;

import java.util.Scanner;

public class ExemploVariavel02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a, b;

        System.out.print("Digite o valor de A: ");
        a = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        b = entrada.nextInt();

        System.out.println("A soma de A = B: " + (a + b));

        entrada.close();

    }
}
