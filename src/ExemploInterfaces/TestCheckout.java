package ExemploInterfaces;

public class TestCheckout {
    public static void main(String[] args) {
        Operadora operadora = new RedeCard();
        Impressora impressora = new ImpressoraHP();

        Cartao cartao = new Cartao();
        cartao.setNumeroCartao("Joao M Couves");
        cartao.setNumeroCartao("123");

        Compra compra = new Compra();
        compra.setNomeCliente("Joao Mendonca Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(5.25);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }

}
