package HerancaEModificadorProtected;

public class TestHeranca {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "Ronaldo";
        j.idade = 33;

        j.seApresentar();
        j.dizerSeAindaJoga();
    }
}
