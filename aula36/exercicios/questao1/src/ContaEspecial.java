public class ContaEspecial extends ContaBancaria {

  private double limite;

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public void sacar(double valor) {
    if (valor > this.getSaldo() && valor > (this.getSaldo() + this.limite)) {
      System.out.println("O valor não pode ser sacado. Saldo insuficiente");
    } else {
      if (valor <= this.getSaldo()) {
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Operação concluída com sucesso.");
      } else {
        double saque = this.getSaldo() - valor;
        this.setSaldo(saque);
        System.out.println("Operação concluída com sucesso. Você precisou utilizar do cheque especial.");
      }
    }
  }
}
