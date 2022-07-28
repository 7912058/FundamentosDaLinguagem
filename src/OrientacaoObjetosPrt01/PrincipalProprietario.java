package OrientacaoObjetosPrt01;

public class PrincipalProprietario {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";

        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "Joao da Silva";
        meuCarro.dono.cpf = "000.000.000-00";
        meuCarro.dono.idade = 26;
        meuCarro.dono.cidade = "Uberlandia";
        meuCarro.dono.bairro = "Centro";
        meuCarro.dono.logradouro = "Rua, Joao Pinheiro numero 03";

        System.out.println(meuCarro.dono.nome);
        System.out.println(meuCarro.dono.cpf);
        System.out.println(meuCarro.dono.idade);
        System.out.println(meuCarro.dono.cidade);
        System.out.println(meuCarro.dono.bairro);
        System.out.println(meuCarro.dono.logradouro);
    }
}
