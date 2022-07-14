package br.com.empiricus.aula07;

public class Veiculo {

    /*
    Encapsulamento:
    - Ocultação dos dados
    - Facilita a manutenção do código
    - reuso

    Serviços(metodos)
    getters (recuperação)
    setters (modificação)

    Visibilidade:
    public      --> Objetos de outras classes e possuem acesso direto.
    protected   --> O acesso é restrito as classes de mesmo pacote
    private     --> O acesso é restrito ao interior da classe

    Atributos
    private String nome;

     */


    //Atributos...
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private int velocidade = 0;


/*    public Veiculo(String modelo, String marca, int anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }*/


    //Serviços...
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    //Métodos...
    void acelerar(int aceleracao) throws InterruptedException {
        for (int i = 0; i < aceleracao; i++) {
            this.velocidade++;
            System.out.println(i);
            Thread.sleep(200);
        };
    }

    void frear(int reduzir) throws InterruptedException {
        for (int i = velocidade; i > reduzir; i--) {
            this.velocidade--;
            System.out.println(i);
            Thread.sleep(200);
        };
    }
}
