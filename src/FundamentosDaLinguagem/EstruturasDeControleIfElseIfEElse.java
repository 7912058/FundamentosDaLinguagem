package FundamentosDaLinguagem;

import java.util.Scanner;

public class EstruturasDeControleIfElseIfEElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu peso: ");
        Integer peso = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC de " + nome + " e " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso ideal.");
        } else if (imc < 30) {
            System.out.println("Acima do peso.");
        } else if (imc < 40) {
            System.out.println("Obesidade grau 1");
        } else {
            System.out.println("Obesidade grau 3");
        }
    }
}
