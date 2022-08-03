package br.com.empiricus.aula08.sobrescrita;

public class ImprimeAnimal {
    public static void main(String[] args) {
        TestaAnimal testaAnimal = new TestaAnimal();

        testaAnimal.fazerAnimalComer(new Cachorro());
        testaAnimal.emitirSom(new Tigre());
    }
}
