package conta;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionarioGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionarioGerenciados() {
        return numeroDeFuncionarioGerenciados;
    }

    public void setNumeroDeFuncionarioGerenciados(int numeroDeFuncionarioGerenciados) {
        this.numeroDeFuncionarioGerenciados = numeroDeFuncionarioGerenciados;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!!");
            return false;
        }
    }

    @Override
    public  double getBonificacao(){
        return this.salario * .15;
    }
}
