package conta;


public class Conta {

    // Atributos da conta
    private int numero;
    Cliente titular;
    private int agencia;
    private double saldo;
    private double limite = 1200.00;
    private String dataDeAbertura;

    public Conta(int numero, Cliente titular, int agencia, double saldo, double limite, String dataDeAbertura) {
        this.numero = numero;
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.dataDeAbertura = dataDeAbertura;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo + this.limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    // Métodos da conta
    boolean sacar(double quantidade) {
        if (this.saldo < quantidade) {
            return false;
        } else {
            this.saldo -= quantidade;
            return true;
        }
    }

    void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transferePara(Conta destino, double valor) {
        // Verifica se temos saldo disponível
        if (this.saldo > valor) {
            // Atualizar o saldo, fazendo o saque
            this.saldo -= valor;
            // Efetua a transferência
            destino.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }

    String recuperaDadosParaImpressao() {
        String dados = "Titular:	" + this.titular;
        dados += "\nNúmero:	" + this.numero;
        dados += "\nAgência:	" + this.agencia;
        dados += "\nSaldo:	R$" + this.saldo;
        dados += "\nData	de	abertura:	" + this.dataDeAbertura;
        return dados;
    }
}