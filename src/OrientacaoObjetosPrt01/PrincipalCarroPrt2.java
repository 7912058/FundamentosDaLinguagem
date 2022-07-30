package OrientacaoObjetosPrt01;

public class PrincipalCarroPrt2 {
    public static void main(String[] args) {
        Proprietario dono1 = new Proprietario();
        dono1.nome = "Joao da silva";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Palio";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "Civic";

        meuCarro.dono = dono1;
        seuCarro.dono = dono1;

        System.out.println("Antes da mudanca");
        System.out.println("Dono carro 1: " + meuCarro.dono.nome);
        System.out.println("Dono carro 2: " + seuCarro.dono.nome);
        System.out.println(dono1.nome);

        meuCarro.dono.nome = "Sebastiao";  // Trocando os nomes.
        System.out.println("------------------------------");

        System.out.println("Depois da mudanca");
        System.out.println("Dono carro 1: " + meuCarro.dono.nome);
        System.out.println("Dono carro 2: " + seuCarro.dono.nome);
        System.out.println(dono1.nome);


    }
}
