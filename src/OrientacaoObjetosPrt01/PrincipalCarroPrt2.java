package OrientacaoObjetosPrt01;

public class PrincipalCarroPrt2 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
     //   meuCarro.modelo = "Palio";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "Civic";

        meuCarro.ligar();
        seuCarro.ligar();
    }
}
