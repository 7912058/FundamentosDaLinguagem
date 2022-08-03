package OrientacaoObjetosPrt01;

public class PrincipalProduto {
    public static void main(String[] args) {
        PrecoProduto preco = new PrecoProduto();
        preco.valorCustos = 140;

        Produto produto = new Produto();
        produto.definirPreco(preco, 20, 15);

        System.out.println("Valor Custos: " + preco.valorCustos);
        System.out.println("Valor Impostos: " + preco.valorImpostos);
        System.out.println("Valor Lucro: " + preco.valorLucro);
        System.out.println("Valor Venda: " + preco.precoVenda);
    }
}
