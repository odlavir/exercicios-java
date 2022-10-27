public class Main {
  public static void main(String[] args) {

//    ContaPoupanca poupanca = new ContaPoupanca();
//    poupanca.setNomeCliente("Odlavir");
//    poupanca.setNumConta("1");
//    poupanca.setSaldo(500);
//    poupanca.setDiaRendimento(0.01);

    ContaEspecial especial = new ContaEspecial();
    especial.setNomeCliente("Odlavir");
    especial.setNumConta("100");
    especial.setSaldo(500);
    especial.setLimite(500);

    especial.sacar(1001);
    System.out.println(especial.getSaldo());

    especial.depositar(200);
    System.out.println(especial.getSaldo());

    especial.sacar(1201);
    System.out.println(especial.getSaldo());

  }
}