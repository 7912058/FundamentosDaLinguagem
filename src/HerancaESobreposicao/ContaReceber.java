package HerancaESobreposicao;

import java.util.Objects;

import static HerancaESobreposicao.SituacaoConta.*;

public class ContaReceber extends Conta {
    private Cliente cliente;

    public ContaReceber() {
    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void cancelar() {
        if (this.getValor() > 50000d) {
            System.out.println("Essa conta a receber nao pode ser cancelada. " +
                    "E muito dinheiro para deixar de receber: " + this.getDescricao());
        } else {
            super.cancelar();
        }
    }

    public void receber() {
        if (Objects.equals(PAGA, this.getSituacaoConta())) {
            System.out.println("Nao pode receber uma conta que ja esta paga: "
                    + this.getDescricao() + ".");
        } else if (CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Nao pode receber uma conta que esta cancelada: "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de "
                    + this.getValor() + " e vencimento em " + this.getDataVencimento()
                    + " do cliente " + this.getCliente().getNome() + ".");

            // altera situação da conta para PAGA
            this.situacaoConta = PAGA;
        }
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
