package Entidades;

public class ProdutoReal extends Produto_Abstrato {
    public ProdutoReal(String nome, String codigo, double preco) {
        super(nome, codigo, preco);
    }
    @Override
    public double calcularImposto() {
        return getPreco() * 0.20;

        }
    }


