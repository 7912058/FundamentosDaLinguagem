package FundamentosDaLinguagem;

public class ConversaoTiposPrimitivo {
    public static void main(String[] args) {
        // casting.
        long x = 10;
        int y = (int) x;
        System.out.println(y);

        double a = 20.5;
        float b = (float) a;
        System.out.println(b);

        double largura = 100.37;  // O valor .37 será truncado.
        int tamanho = (int) largura;
        System.out.println(tamanho);  // Valor imprimido na tela será apenas o 100.

        //Conversão de Tipos Primitivos https://image3.slideserve.com/6332827/conversi-n-entre-tipos-primitivos1-l.jpg
    }
}
