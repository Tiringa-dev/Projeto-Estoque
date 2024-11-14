package Entidades;
//classe abstrata
public abstract class Produto_Abstrato {
    private String nome;
    private String codigo;
    private double preco;

    public Produto_Abstrato(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "nome do produto: " + nome + "codigo: " + codigo + "R$: " + preco;
    }


    public abstract double caulcularImposto();
    public double calcularImposto() {
        return getPreco() * 0.20;
    }
}














