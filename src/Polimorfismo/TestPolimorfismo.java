package Polimorfismo;

public class TestPolimorfismo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);
        TestPolimorfismo.imprimirSaldo(conta);
        System.out.println();
        //----------------------------------------------
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);
        System.out.println();
        //----------------------------------------------
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);
    }

    private static void imprimirSaldo(Conta conta) {
        System.out.println("Saldo da conta: R$ " + conta.getSaldo());

        if(conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da conta corrente e R$: " + cc.getLimite());
        }
        if (conta instanceof  ContaPoupanca) {
            ContaPoupanca cp = (ContaPoupanca) conta;
            System.out.println("O rendimento da conta poupanca e R$: " + cp.getRendimentos());
        }
    }
}
