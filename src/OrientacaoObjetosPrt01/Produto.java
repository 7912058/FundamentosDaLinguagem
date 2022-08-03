package OrientacaoObjetosPrt01;

public class Produto {
    // Adicionar 20% ao preço de custo
    void  definirPreco (PrecoProduto preco, double percentualImpostos, double margemLucro) {

        preco.valorImpostos = preco.valorCustos
                * (percentualImpostos / 100);

        preco.valorLucro = preco.valorCustos
                * (margemLucro / 100);

        preco.precoVenda = preco.valorCustos
                + percentualImpostos + preco.valorLucro;
    }
}
