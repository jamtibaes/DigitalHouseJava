package br.com.empiricus.aula04;

import java.util.Scanner;

public class EstruturaRepeticaoWhile02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        String resposta;

        while(numero != 10){
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();

            resposta = numero > 18 ? "Pode voltar" : "Não pode voltar";
            System.out.println(resposta);
        }

    }
}
