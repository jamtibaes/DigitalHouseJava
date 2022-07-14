package br.com.empiricus.aula07.sobrecargaMetodo;

public class TestaMinhaCalculadora {

    public static void main(String[] args) {
        MinhaCalculadora calculadora = new MinhaCalculadora();
        System.out.println(calculadora.soma(10,20));
        System.out.println(calculadora.soma(10.0,20));
        System.out.println(calculadora.soma(10.0,20,1.234));
        System.out.println(calculadora.soma(10,20,23));


    }



}
