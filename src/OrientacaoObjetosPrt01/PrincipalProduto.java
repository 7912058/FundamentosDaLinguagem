package OrientacaoObjetosPrt01;

public class PrincipalProduto {
    public static void main(String[] args) {
        PrecoProduto preco = new PrecoProduto();
        preco.valorCustos = 140;

        Produto produto = new Produto();
        produto.definirPreco(preco, 20, 15);

        System.out.println("Valor custos: " + preco.valorCustos);
        System.out.println("Valor impostos: " + preco.valorImpostos);
        System.out.println("Valor lucro: " + preco.valorLucro);
        System.out.println("Valor venda: " + preco.precoVenda);
    }
}
