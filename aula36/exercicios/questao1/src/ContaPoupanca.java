public class ContaPoupanca extends ContaBancaria {

  private double diaRendimento;

  public double getDiaRendimento() {
    return diaRendimento;
  }


  public void setDiaRendimento(double diaRendimento) {
    this.diaRendimento = diaRendimento;
  }

  public void calcularNovoSaldo(int dias) {
    double totalRendido = dias * this.diaRendimento * this.getSaldo();
    depositar(totalRendido);
  }
}
