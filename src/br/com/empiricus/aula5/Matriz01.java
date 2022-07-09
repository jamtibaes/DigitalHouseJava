package br.com.empiricus.aula5;

import java.util.Random;
import java.util.Scanner;

public class Matriz01 {

    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        double[][] notasAlunos = new double[2][4];

        notasAlunos[0][0] = 9.9;
        notasAlunos[0][1] = 8.9;
        notasAlunos[0][2] = 7.9;
        notasAlunos[0][3] = 6.9;

        notasAlunos[1][0] = 5.9;
        notasAlunos[1][1] = 4.9;
        notasAlunos[1][2] = 3.9;
        notasAlunos[1][3] = 2.9;

        for (int linha = 0; linha < notasAlunos.length; linha++) {
            for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
                notasAlunos[linha][coluna] = aleatorio.nextDouble(100.0);
                System.out.printf("%.2f | ", notasAlunos[linha][coluna]);
            }
            System.out.println();
        }

        //entrada.close();

    }
}
