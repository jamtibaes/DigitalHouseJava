package br.com.empiricus.aula06;

public class TestaMetodo {

    static int numero3, numero4, multiplicacao, divisao;

    public static void main(String[] args) {

        metodo01();
        metodo02();
        metodo03();
        metodo04();
        metodo06(10, 2);

        System.out.println(MetodoFora.metodo07(0,10));

        OutroMetodo.metodo08();

    }

    public static void metodo01(){
        System.out.println("Calculadora");
    }

    public static void metodo02(){
        int numero1 = 10, numero2 = 20, soma;
        soma = numero1 + numero2;
        System.out.println("Soma: " + soma);
    }

    public static void metodo03(){
        int numero1 = 10, numero2 = 20, subtracao;
        subtracao = numero1 + numero2;
        System.out.println("Subtração: " + subtracao);
    }

    public static void metodo04(){
        numero3 = 8;
        numero4 = 5;
        multiplicacao = numero4 * numero3;
        metodo05();
    }

    public static void metodo05(){
        System.out.println("Multiplicação: " + multiplicacao);
    }

    public static void metodo06(int numero5, int numero6){
        divisao = numero5 / numero6;
        System.out.println("Divisão: " + divisao);
    }




}
