package br.com.empiricus.aula07.sobrecargaMetodo;

public class Sobrecarga02 {
    public static void main(String[] args) {
        linha('a', 10);
        linha('b');
        linha();
        linha("d",40);
        linha("e");
    }

    public static void linha(char tipo, int tamanho){
        System.out.println("Primeira versão");
        for (int i = 0; i < tamanho ; i++) {
            System.out.printf("%c", tipo);
        }
        System.out.println();
    }

    public static void linha(char tipo){
        System.out.println("Segunda versão");
        for (int i = 0; i <= 20 ; i++) {
            System.out.printf("%c", tipo);
        }
        System.out.println();
    }

    public static void linha(){
        System.out.println("Terceira versão");
        for (int i = 0; i <= 30 ; i++) {
            System.out.printf("c");
        }
        System.out.println();
    }

    public static void linha(String tipo, int tamanho){
        System.out.println("Quarta versão");
        for (int i = 0; i < tamanho ; i++) {
            System.out.printf("%s", tipo);
        }
        System.out.println();
    }

    public static void linha(String tipo){
        System.out.println("Quinta versão");
        for (int i = 0; i <= 50 ; i++) {
            System.out.printf("%s", tipo);
        }
        System.out.println();
    }

}
