package br.com.empiricus.aula05;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

    // Um dado é lançado 10 vezes e o valor correspondente é anotado.
    // Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
    // A seguir determine e imprima a média aritmética dos lançamentos,
    // contabilize e apresente também quantas foram as ocorrências da maior pontuação.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        double soma = 0.0; double maiorValor = 0.0;
        int quantidadeLancamentos = 10; int contador = 0;
        int[] lancamento = new int[quantidadeLancamentos];

        for (int i = 0; i < quantidadeLancamentos; i++) {
            lancamento[i] = aleatorio.nextInt(5) + 1;
            System.out.print(lancamento[i] + " | ");
            soma += lancamento[0];

            if (maiorValor < lancamento[i]){
                maiorValor = lancamento[i];
                contador = 0;
            }

            if(maiorValor == lancamento[i]) {
                contador++;
            }
        }

        double media = soma/( quantidadeLancamentos * 1.0 );

        System.out.printf("Soma: %s, Média: %.2f, Maior: %s, Repetição do Maior: %s", (int) soma, media, (int) maiorValor , contador);

        entrada.close();
    }

}
