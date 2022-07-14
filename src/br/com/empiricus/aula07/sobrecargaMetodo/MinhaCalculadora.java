package br.com.empiricus.aula07.sobrecargaMetodo;

public class MinhaCalculadora {

    public static int soma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static double soma(double numero1, double numero2){
        return numero1 + numero2;
    }

    public static double soma(double numero1, double numero2, double numero3){
        return numero1 + numero2 + numero3;
    }

    public static int soma(int numero1, int numero2, int numero3){
        System.out.println("3 int");
        return numero1 + numero2 + numero3;
    }



}
