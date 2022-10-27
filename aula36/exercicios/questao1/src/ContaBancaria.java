public class ContaBancaria {

  private String nomeCliente;
  private String numConta;
  private double saldo;

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void sacar(double valor) {
    if(valor > this.saldo) {
      System.out.println("O valor não pode ser sacado. Saldo insuficiente");
    } else {
      this.saldo -= valor;
      System.out.println("Operação concluída com sucesso.");
    }
  }

  public void depositar(double valor) {
    if(valor <= 0) {
      System.out.println("Não foi possível realizar a transação. Saldo incorreto.");
    } else {
      this.saldo += valor;
      System.out.println("Operação concluída com sucesso.");
    }
  }
}
