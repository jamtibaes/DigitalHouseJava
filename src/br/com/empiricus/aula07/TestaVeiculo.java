package br.com.empiricus.aula07;

public class TestaVeiculo {

    public static void main(String[] args) throws InterruptedException {

        Veiculo veiculo = new Veiculo();

        veiculo.setMarca("Fiat");
        veiculo.setModelo("Mobi");
        veiculo.setAnoFabricacao(2018);

        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAnoFabricacao());
        veiculo.acelerar(20);
        veiculo.frear(10);

    }

}
