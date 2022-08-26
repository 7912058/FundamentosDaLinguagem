package OrientacaoObjetosPrt02;

public class PessoaBean {
    private String nome;
    private Integer idade;

    public PessoaBean(){

    }
    //Setter  e  Getter

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }
}

