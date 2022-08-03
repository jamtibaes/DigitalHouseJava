package br.com.empiricus.aula08.sobrescrita;

public class TestaAnimal {

    public void fazerAnimalComer(Animal animal){
        animal.comer();
    }

    public void emitirSom(Animal animal){
        animal.somAnimal();
    }


}
