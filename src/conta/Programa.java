package conta;

public class Programa {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Guilherme", "Santos", "123.321.123-95", "119580-1253", "guiSant@gmail.com", 2005);
        Cliente cliente2 = new Cliente("Francisco", "Silva", "987.321.544-95", "119580-2352", "franSilva@gmail.com", 2004);
        Conta minhaConta = new Conta(123, cliente1, 2255, 0, 0, "15/08/2023");
        Conta meuSonho = new Conta(124, cliente2, 2255, 0, 0, "16/08/2023");

        if (meuSonho.transferePara(minhaConta, 200010.00)) {
            System.out.println("Operação efetuada com sucesso!!");
        } else {
            System.out.println("Erro ao tranferir...Verifique o saldo...!!");
        }

        System.out.println("Saldo atual: " + minhaConta.getSaldo());

        //mensagem de sucesso!
        if (minhaConta.sacar(201.00)) {
            System.out.println("Operação efetuada com sucesso!!");
        } else {
            System.out.println("Erro...Verifique o saldo...!!");
        }

        System.out.println("Saldo depois de sacar: " + minhaConta.getSaldo());

        minhaConta.depositar(15234.12);

        System.out.println("Saldo depois de depositar: " + minhaConta.getSaldo());

        System.out.println(minhaConta.recuperaDadosParaImpressao());
    }

}