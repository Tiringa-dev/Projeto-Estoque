import Entidades.*;
import Repositorios.Repositorio_produtos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Cadastropf user1 = new Cadastropf("Rivaldo", "55643310", "10392913410", "05042004", "81 992638976");
       // Cadastropj user2 = new Cadastropj("Walife", "55643310", "1231928371892371", "Casa Mirandas");

        System.out.println("---------------------------------------");

        Repositorio_produtos listaproduto = new Repositorio_produtos(10);

        String nome = "caneta";
        String marca = "bic";
        String composicao = "plastico";
        int codigoInterno = 23456001 ;
        double valor = 2.50;
        int quantidade = 300;

        Produto produto1 = new Produto(nome, marca, composicao, codigoInterno, valor, quantidade);

        System.out.println(produto1);
        listaproduto.editarProduto(1, "lapis", marca, "madeira",65478002, 1.30, quantidade);
        System.out.println(produto1);


        Produto_Abstrato estoque = new ProdutoReal("Garrafa Térmica", "001", 25.00);

            System.out.println("Nome: " + estoque.getNome());
            System.out.println("Código: " + estoque.getCodigo());
            System.out.println("Preço: R$ " + estoque.getPreco());
            System.out.println("Imposto: R$ " + ((ProdutoReal) estoque).calcularImposto());
            System.out.printf("Revenda: " + ((estoque.getPreco() + estoque.calcularImposto()) * 2.02));


    }
}
