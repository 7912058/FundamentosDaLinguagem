package FundamentosDaLinguagem;

public class PromocaoAritmetica {
    public static void main(String[] args) {
        int x = 10;
        long y = 5;
        long z = x + y;
        System.out.println(z);

        long a = 10;
        float b = 9.34f; // fazer assim corre o risco de perder casas decimais.
        long c = (long) (a * b); // maneira correta é colocar o tipo float.
        System.out.println(c);

        int a1 = 3; // Duas somas inteiras, resulta em números inteiro.
        int b1 = 2; // Necessário ter uma das somas como float para promover o int para float.
        float c1 = a1 / b1;
        System.out.println(c1);

        // Exemplo de como promover tipo int para float.
        int a2 = 3;
        int b2 = 2;
        float c2 = a2 / (float) b2;
        System.out.println(c2);
    }
}
