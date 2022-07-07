package br.com.empiricus.aula04;

import java.util.Scanner;

public class EstruturaRepeticaoWhile03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        do {

            System.out.print("Entre com o número 1: ");
            int numero1 = entrada.nextInt();

            System.out.print("Entre com o número 2: ");
            int numero2 = entrada.nextInt();

            if (numero2 == 0){
                System.out.println("Não podemos dividir por zero...");
                break;
            }

            System.out.println((numero+1) + "º resultado " + numero1 + "/" + numero2 + " é: " + numero1/numero2);

            numero++;

        } while (numero < 3);

        System.out.println("Fim do programa...");

        entrada.close();

    }
}
