package FundamentosDaLinguagem;

import java.util.Scanner;

public class EstruturaDeControleSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o final da placa: ");
        int finalPlaca = entrada.nextInt();

        switch (finalPlaca) {
            case 1:
                System.out.println("Vencimento dia 11 de janeiro.");
                break;
            case 2:
                System.out.println("Vencimento dia 12 de fevereiro.");
                break;

            default:
                System.out.println("Opcao invalida.");
        }
    }
}
