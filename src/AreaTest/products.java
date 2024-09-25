package AreaTest;

import Entidades.Produto;

public class products {
    public static void main (String [] args){

        Produto p1 = new Produto("Desinfetante", "Brilux", "H2O, Minóxido de carbono", 1356, 4, 400);




        System.out.println("Nome: " + p1.getNome());
        System.out.println("Marca: " + p1.getMarca());
        System.out.println("Composto por: "+ p1.getComposicao());
        System.out.println("Código: "+ p1.getcodigoInterno());
        System.out.println("Preço: R$"+ p1.getValor());
        System.out.println("Quantidade: "+ p1.getQuantidade());

    }
}
