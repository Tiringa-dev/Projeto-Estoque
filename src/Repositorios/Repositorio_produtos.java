package Repositorios;

import Entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class Repositorio_produtos {

    private List<Produto> produto;
    int produtoindex;
    public Repositorio_produtos(int produtototal){

            this.produto = new ArrayList<>();
            for (int i = 1; i <= produtototal; i++ ){
            produto.add(new Produto(i));
            produtoindex = i;
            }
        }
    public void novoproduto(Produto p){
        this.produto.add(p);
    }
    public void exluirproduto(Produto p){
        this.produto.remove(p);
    }
    public void editarProduto(int produtoindex, String nomeatt, String marcaatt, String composicaoatt, int codigoatt, double valoratt, int quantidadeatt){
        this.produto.get(produtoindex).setNome(nomeatt);
        this.produto.get(produtoindex).setMarca(marcaatt);
        this.produto.get(produtoindex).setComposicao(composicaoatt);
        this.produto.get(produtoindex).setCodigoInterno(codigoatt);
        this.produto.get(produtoindex).setValor(valoratt);
        this.produto.get(produtoindex).setQuantidade(quantidadeatt);

    }
}