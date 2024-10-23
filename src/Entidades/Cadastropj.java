package Entidades;

public class Cadastropj extends Fornecedores {

    private String cnpj;
    private String nomeFantasia;

    public Cadastropj() {
    }


    public Cadastropj(String nome, String cep, String cnpj, String nomeFantasia) {
        super(nome, cep);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

        public String getCnpj() {
                return cnpj;
            }
            public void setCnpj(String cnpj) {
                this.cnpj = cnpj;
            }
            public String getNomeFantasia() {
                return nomeFantasia;
            }
            public void setNomeFantasia(String nomeFantasia) {
                this.nomeFantasia = nomeFantasia;
            }

    @Override
    public String toString() {
        return "CNPJ: " + cnpj;
    }
}
