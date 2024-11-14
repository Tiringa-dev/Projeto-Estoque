import Entidades.Cadastropf;
import Entidades.Cadastropj;
import Entidades.ProdutoReal;
import Entidades.Produto_Abstrato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cadastropf user1 = new Cadastropf("Rivaldo", "55643310", "10392913410", "05042004", "81 992638976");
        Cadastropj user2 = new Cadastropj("Walife", "55643310", "1231928371892371", "Casa Mirandas");

        System.out.println(user1);
        System.out.println(user2);

        System.out.println("---------------------------------------");

        Produto_Abstrato estoque = new ProdutoReal("Garrafa Térmica", "001", 25.00);
        {
            System.out.println("Nome: " + estoque.getNome());
            System.out.println("Código: " + estoque.getCodigo());
            System.out.println("Preço: R$ " + estoque.getPreco());
            System.out.println("Imposto: R$ " + ((ProdutoReal) estoque).calcularImposto());
        }
    }
}
