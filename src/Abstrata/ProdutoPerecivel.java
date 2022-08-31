package Abstrata;

public class ProdutoPerecivel extends Produto {
    String dataValidade; //por enquanto até aprender clase Date
    public void imprimirDescricao() {
        //Digitar a logicca
        System.out.println("Descricao: " + descricao + ". Vencendo em: " +  dataValidade);
    }
}
