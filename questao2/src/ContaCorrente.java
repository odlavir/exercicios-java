import java.sql.SQLOutput;

public class ContaCorrente {

    private String numeroConta;
    private String agencia;
    private double limite;
    private double limiteUsado;
    private double saldo;
    private boolean especial;

    public ContaCorrente(String numeroConta, String agencia, double limite, double limiteUsado, double saldo, boolean especial) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.limite = limite;
        this.limiteUsado = limiteUsado;
        this.saldo = saldo;
        this.especial = especial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimiteUsado() {
        return limiteUsado;
    }

    public void setLimiteUsado(double limiteUsado) {
        this.limiteUsado = limiteUsado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public void sacar(double saque) {
        if(saque <= this.saldo) {
            this.saldo -= saque;
            System.out.println("Saque de " + saque + " realizado com sucesso.");
        } else {
            if(isEspecial()) {
                if(saque <= (this.saldo + this.limite)) {
                    this.saldo = this.saldo - saque;
                    this.limiteUsado = -this.saldo;
                    this.limite -= this.limiteUsado;
                    System.out.println("Você entrou no cheque especial. Saque de " + saque + " realizado com sucesso.");
                }  else {
                    System.out.println("Não foi possivel realizar o saque. Saldo insuficiente.");
                }
            } else {
                System.out.println("Não foi possivel realizar o saque. Saldo insuficiente.");
            }

        }
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
        System.out.println("Deposito de " + deposito + " efetuado com sucesso.");
    }
    public void saldo() {
        System.out.println("Seu saldo é de " + this.saldo);
    }
}

