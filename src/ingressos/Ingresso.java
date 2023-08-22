package ingressos;

public class Ingresso {
    private double valor;

    @Override
    public String toString() {
        return "ingressos " +
                "valor = " + this.valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
