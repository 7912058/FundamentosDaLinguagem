package Abstrata;

public class TestAbstrata {
    public static void main(String[] args) {

        ProdutoPerecivel p = new ProdutoPerecivel();
        p.descricao = "Caixa de Leite";

        ProdutoPerecivel pp = (ProdutoPerecivel) p;
        pp.dataValidade = "10/03/2023";

        p.imprimirDescricao();
    }
}
