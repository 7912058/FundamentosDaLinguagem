package FundamentosDaLinguagem;

import java.util.Scanner; // import para entrada de dados.

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Codigo para receber entrada de dados.

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu peso: ");
        Integer peso = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double calculoImc = peso / (altura * altura);

        System.out.println("O IMC de " + nome + " e " + calculoImc);
    }
}
