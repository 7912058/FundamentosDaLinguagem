package OrientacaoObjetosPrt02;

public class Pessoa {

    String nome;
    Integer idade;

    public Pessoa(String pessoa) {
        this.nome = nome;
        // Se tiver uma inicialização bem complicada de fazer
    }

    Pessoa(String nome, int idade) {
        this(nome) ; // Deve ser a primeira instrução dentro do construtor.
        this.idade = idade;
    }
}