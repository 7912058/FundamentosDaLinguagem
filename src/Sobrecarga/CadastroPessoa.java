package Sobrecarga;

public class CadastroPessoa {
    public  void cadastrar(Pessoa pessoa) {
        armazenar(pessoa.getNome(), pessoa.getIdade());
    }


    public void cadastrar(String nome, Integer idade) {
        armazenar(nome, idade);
    }

    private void armazenar(String nome, Integer idade) {
        // Salva no banco de dados...
        System.out.println("Salvando: \"" + nome + "\" com " + idade + " anos.");
}
    }