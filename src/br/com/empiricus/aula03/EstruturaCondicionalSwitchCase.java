package br.com.empiricus.aula03;

import java.util.Scanner;

public class EstruturaCondicionalSwitchCase {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do mês: ");
        int mes = entrada.nextInt();

        /*
        if      (mes ==  1) System.out.println("Janeiro");
        else if (mes ==  2) System.out.println("Fevereiro");
        else if (mes ==  3) System.out.println("Março");
        else if (mes ==  4) System.out.println("Abril");
        else if (mes ==  5) System.out.println("Maio");
        else if (mes ==  6) System.out.println("Junho");
        else if (mes ==  7) System.out.println("Julho");
        else if (mes ==  8) System.out.println("Agosto");
        else if (mes ==  9) System.out.println("Setembro");
        else if (mes == 10) System.out.println("Outubro");
        else if (mes == 11) System.out.println("Novembro");
        else if (mes == 12) System.out.println("Dezembro");
        else System.out.println("Mês inválido");
        */

        String textoMes;
        switch (mes) {
            case 1:     textoMes = "Janeiro";      break;
            case 2:     textoMes = "Fevereiro";    break;
            case 3:     textoMes = "Março";        break;
            case 4:     textoMes = "Abril";        break;
            case 5:     textoMes = "Maio";         break;
            case 6:     textoMes = "Junho";        break;
            case 7:     textoMes = "Julho";        break;
            case 8:     textoMes = "Agosto";       break;
            case 9:     textoMes = "Setembro";     break;
            case 10:    textoMes = "Outubro";      break;
            case 11:    textoMes = "Novembro";     break;
            case 12:    textoMes = "Dezembro";     break;
            default:    textoMes = "Mês inválido"; break;
        }

        System.out.println(textoMes);

        entrada.close();


        //TERNÁRIO
        int numero1= 10;
        int numero2= 10;
        int maior = 0;
        maior = numero1>numero2 ? numero1 : numero2;

        System.out.println(maior);

    }
}
