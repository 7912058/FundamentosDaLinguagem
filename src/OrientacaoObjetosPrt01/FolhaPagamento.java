package OrientacaoObjetosPrt01;

public class FolhaPagamento {
    // Assinatura do método, double calcularSalario(int, int, double, double)
    double calcularSalario(int horasNormais, int horasExtras,
                           double valorHorasNormal, double valorHorasExtra) {
        double valorHorasNormais = horasNormais * valorHorasNormal;
        double valorHorasExtras = horasExtras * valorHorasExtra;

        return valorHorasNormais + valorHorasExtras;
    }

}
