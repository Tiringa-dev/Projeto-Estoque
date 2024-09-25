package Entidades;

public class Produto {

    String nome;
    String marca;
    String composicao;
    int codigoInterno;
    double valor;
    int quantidade;


    public Produto(String nome, String marca, String composicao, int codigoInterno, double valor, int quantidade){
        this.nome = nome;
        this.marca = marca;
        this.composicao = composicao;
        this.codigoInterno = codigoInterno;
        this.valor = valor;
        this.quantidade = quantidade;


    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public int getcodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
