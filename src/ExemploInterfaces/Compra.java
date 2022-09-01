package ExemploInterfaces;

public class Compra implements Autorizavel, Imprimivel {

    private double valorTotal;
    private String Produto;
    private String nomeCliente;

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String getCabecalhoPagina() {
        return this.getProduto() + " = " + this.getValorTotal();
    }

    @Override
    public String getCorpoPagina() {
        return this.nomeCliente;
    }
}


