package FundamentosDaLinguagem;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite (1) para 'Masculino'");
        System.out.println("Digite (2) para 'Feminino'");

        char sexo = entrada.nextShort() == 1 ? 'M' : 'F';

        double imc = (peso / (altura * altura));
        System.out.println("Ola: " + nome);
        System.out.printf("Seu IMC e de: %.2f", imc);
        if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
            System.out.println(" Abaixo do peso.");
        } else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc < 25.4)) {
            System.out.println(" Peso ideal.");
        } else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc < 27.8)) {
            System.out.println(" Um pouco acima do peso.");
        } else if ((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc < 31.1)) {
            System.out.println(" Acima do peso ideal.");
        } else {
            System.out.println(" Obeso.");
        }

        entrada.close();
    }
}