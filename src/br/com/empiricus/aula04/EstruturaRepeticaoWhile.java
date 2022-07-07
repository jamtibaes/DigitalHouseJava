package br.com.empiricus.aula04;

public class EstruturaRepeticaoWhile {

    public static void main(String[] args) throws InterruptedException {

        int contador = 0;
        while(contador <= 10) {
            System.out.println("Repetição: " + contador);
            contador++;
            Thread.sleep(500);
        }
        contador+=5;

        System.out.println(contador);


    }

}
