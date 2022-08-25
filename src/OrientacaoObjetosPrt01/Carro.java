package OrientacaoObjetosPrt01;

public class Carro {
        public Integer anoDeFabricacao;
        public String fabricante;
        public String modelo;
        public String cor;

        public Boolean biCombustivel;

        Proprietario dono;

        public void alterarModelo(String modelo) {
                if (modelo !=null){
                        this.modelo = modelo;
                }
        }
        public void ligar () {
                if (modelo != null) {
                }
                System.out.println("Ligando o carro: " + modelo);
        }
}
