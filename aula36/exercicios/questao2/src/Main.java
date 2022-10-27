import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    ReceitaFederal receitaFederal = new ReceitaFederal();

    Contribuinte[] contribuintes = new Contribuinte[2];

    for (int i = 0; i < contribuintes.length; i++) {

      Contribuinte c = new Contribuinte();

      System.out.print("Digite o nome do " + (i+1) + " cliente: ");
      c.setNome(scan.nextLine());

      System.out.print("Digite a natureza do " + (i+1) + " cliente (PF ou PJ): ");
      c.setNatureza(scan.nextLine());

      System.out.print("Digite a renda bruta do " + (i+1) + " cliente: ");
      c.setRendaBruta(scan.nextDouble());

      System.out.println("--------------------------------------------------------------");

      scan.nextLine();

      contribuintes[i] = c;
    }

    receitaFederal.setContribuintes(contribuintes);

    receitaFederal.obterInfo();


    Contribuinte pessoa = new Contribuinte("Odlavir", "PF", 15000);

    pessoa.obterInfo();
  }
}