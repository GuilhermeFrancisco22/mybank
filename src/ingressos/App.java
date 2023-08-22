package ingressos;

public class App {
    public static void main(String[] args) {
        Ingresso ingressos = new Ingresso();
        ingressos.setValor(180);
        System.out.println(ingressos.toString());

        IngressosVip vip = new IngressosVip();
        vip.setValorAdd(22);
        vip.setValor(220);

        System.out.println(vip.toString());

    }

}
