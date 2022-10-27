import java.util.Arrays;

public class ReceitaFederal {

  private Contribuinte[] contribuintes;

  public Contribuinte[] getContribuintes() {
    return contribuintes;
  }

  public void setContribuintes(Contribuinte[] contribuintes) {
    this.contribuintes = contribuintes;
  }

  public void obterInfo() {
    for (int i = 0; i < contribuintes.length; i++) {
      contribuintes[i].obterInfo();
    }
  }
}
