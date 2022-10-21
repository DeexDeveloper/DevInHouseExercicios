package M01S04.ex3;

/*Crie uma classe chamada "Produto" que implemente esta interface criada anteriormente.*/

public class Produto implements Tributavel{

    private double valor;
    private double valorImposto;



    @Override
    public double calcularValorComImposto() {
        return this.valor+this.valorImposto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

}
