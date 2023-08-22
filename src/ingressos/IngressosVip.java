package ingressos;

public class IngressosVip extends Ingresso {

    private double valorAdd;

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getValor() {
        return super.getValor();
    }

    @Override
    public void setValor(double valor) {

        super.setValor(valor + valorAdd);

    }

    public double getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(double valorAdd) {
        this.valorAdd = valorAdd;
    }


}
