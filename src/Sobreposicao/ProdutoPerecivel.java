package Sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    protected Date dataValidade;

    @Override
    public void identificar() {
        super.identificar();
        System.out.println("Data de validade: " + dataValidade);
    }
}

