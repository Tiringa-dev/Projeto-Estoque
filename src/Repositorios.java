//Repositórios: Repositório de Produtos, Repositório de Fornecedores*/

import Entidades.Cadastropf;
import Entidades.Cadastropj;
import Entidades.Produto;
import Entidades.Fornecedores;
import java.util.ArrayList;
import java.util.List;

public class Repositorios {

  private List<Cadastropf> cadastropf;
  private List<Cadastropj> cadastropj;
  private List<Produto> produto;

    public Repositorios(){
        this.cadastropf = new ArrayList<Cadastropf>();
        this.cadastropj = new ArrayList<Cadastropj>();
        this.produto = new ArrayList<Produto>();

        Cadastropf William = new Cadastropf("William", "55643-000", "14758444545", "20-05-2003", "(81) 9.98100041");
        Cadastropf Falcao = new Cadastropf("Falcao", "55643000", "14122578415", "11-06-2006", "(81) 9. 89884030");
        Cadastropf Nascimento = new Cadastropf("Nascimento", "55643000", "15724417133", "13-08-2003", "(81) 9.79107860");

        this.cadastropf.add(William);
        this.cadastropf.add(Falcao);
        this.cadastropf.add(Nascimento);

    }
}
