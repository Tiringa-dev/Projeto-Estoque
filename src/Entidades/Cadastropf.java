package Entidades;

public class Cadastropf extends Fornecedores{

    private String cpf;
    private String dataDeNascimento;
    private String contatocllr;

    public Cadastropf() {
    }

    public Cadastropf(String nome, String cep, String cpf, String dataDeNascimento, String contatocllr) {
        super(nome, cep);
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.contatocllr = contatocllr;
    }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public String getDataDeNascimento() {
            return dataDeNascimento;
        }
        public void setDataDeNascimento(String dataDeNascimento) {
            this.dataDeNascimento = dataDeNascimento;
        }
        public String getContatocllr() {
            return contatocllr;
        }
        public void setContatocllr(String contatocllr) {
            this.contatocllr = contatocllr;
        }

    @Override
    public String toString() {
        return "Cpf " + cpf;

    }
}
