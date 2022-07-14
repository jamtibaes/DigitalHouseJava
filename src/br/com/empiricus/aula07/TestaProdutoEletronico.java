package br.com.empiricus.aula07;

public class TestaProdutoEletronico {

    public static void main(String[] args) {

        ProdutoEletronico produto = new ProdutoEletronico();

        produto.setNome("Xbox");
        produto.setDescricao("Video Game de ultima geração");
        produto.setValorUnitario(2000);

        System.out.printf("O produto %s que é %s custa R$ %.2f\n", produto.getNome(), produto.getDescricao(), produto.getValorUnitario());

        float valorComDesconto =  produto.calcularDesconto(50);
        System.out.printf("Valor final: R$ %.2f",valorComDesconto);

    }

}
