package OrientacaoObjetosPrt02;

public class Construtores {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao");

        System.out.println("Nome: \"" + p1.nome + "\" tem " +  p1.idade + " anos.");

        p1.idade = 25;

        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");
    }
}
