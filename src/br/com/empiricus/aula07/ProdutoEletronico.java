package br.com.empiricus.aula07;

public class ProdutoEletronico {

    private String nome;
    private String descricao;
    private float valorUnitario;

    public float calcularDesconto(float desconto){
        return valorUnitario -= desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


}
