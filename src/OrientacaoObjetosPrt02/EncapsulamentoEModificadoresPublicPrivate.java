package OrientacaoObjetosPrt02;

public class EncapsulamentoEModificadoresPublicPrivate {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();

        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura());

        ar.obterTemperatura();
        System.out.println("Temperatura do ar: " + ar.obterTemperatura());
    }
}
