package OrientacaoObjetosPrt02;

public class ArCondicionado {

    private Integer temperatura;

    void trocarTemperatura(Integer temperatura){
        if (temperatura >= 17 && temperatura <= 25){
            this.temperatura = temperatura;
        }
    }
    int obterTemperatura() {
        return temperatura;
    }
}
