package br.com.empiricus.aula05;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Faça um programa que crie um vetor por leitura com 5 valores de pontuação
        //de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.


        Scanner entrada = new Scanner(System.in);
        int[] pontuacao = new int[5];
        int maior = 0;

        for (int i = 0; i < pontuacao.length; i++) {
            System.out.printf("Digite o valor %s: ", i + 1);
            pontuacao[i] = entrada.nextInt();
        }

        for (int i = 0; i < pontuacao.length; i++) {
            if(pontuacao[i] > maior) {
                maior = pontuacao[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
        entrada.close();

    }


}
