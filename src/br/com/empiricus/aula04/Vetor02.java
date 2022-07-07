package br.com.empiricus.aula04;

import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        System.out.println("---PROGRAMA NOTAS---");
        Scanner entrada = new Scanner(System.in);

        double soma = 0.0;
        double media;

        System.out.print("Defina a quantidade de notas: ");
        int tamanhoVetor = entrada.nextInt();
        double[] notas = new double[tamanhoVetor];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite as notas P%d: ",i+1);
            notas[i] = entrada.nextDouble();
            soma += notas[i];
        }

        media = soma/notas.length;
        System.out.printf("Média: %.2f", media);
        entrada.close();
    }
}
