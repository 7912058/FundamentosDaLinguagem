package ExemploInterfaces;

public class RedeCard implements Operadora{
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123")
                && autorizavel.getValorTotal() < 200;
    }
}
