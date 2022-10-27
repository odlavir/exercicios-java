public class Contribuinte {

  private String nome;
  private String natureza;
  private double rendaBruta;

  public Contribuinte() {
  }

  public Contribuinte(String nome, String natureza, double rendaBruta) {
    this.nome = nome;
    this.natureza = natureza;
    this.rendaBruta = rendaBruta;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNatureza() {
    return natureza;
  }

  public void setNatureza(String natureza) {
    this.natureza = natureza;
  }

  public double getRendaBruta() {
    return rendaBruta;
  }

  public void setRendaBruta(double rendaBruta) {
    this.rendaBruta = rendaBruta;
  }

  public void calcularImposto() {
    double aliquota = 0;
    double deducao = 0;
    if (this.getNatureza() == "PJ") {
      aliquota = 0.1;
      deducao = this.getRendaBruta() * aliquota;
      System.out.println("A dedução será de: " + deducao + " reais.");
    } else if (this.getNatureza() == "PF") {
      if (this.getRendaBruta() >= 0 && this.getRendaBruta() <= 1400) {
        aliquota = 0.0;
        deducao = this.getRendaBruta() * aliquota;
        System.out.println("A dedução será de: " + deducao + " reais.");
      } else if (this.getRendaBruta() > 1400 && this.getRendaBruta() <= 2100) {
        aliquota = 0.1;
        deducao = this.getRendaBruta() * aliquota;
        System.out.println("A dedução será de: " + deducao + " reais.");
      } else if (this.getRendaBruta() > 2100 && this.getRendaBruta() <= 2800) {
        aliquota = 0.15;
        deducao = this.getRendaBruta() * aliquota;
        System.out.println("A dedução será de: " + deducao + " reais.");
      } else if (this.getRendaBruta() > 2800 && this.getRendaBruta() <= 3600) {
        aliquota = 0.25;
        deducao = this.getRendaBruta() * aliquota;
        System.out.println("A dedução será de: " + deducao + " reais.");
      } else if (this.getRendaBruta() > 3600) {
        aliquota = 0.3;
        deducao = this.getRendaBruta() * aliquota;
        System.out.println("A dedução será de: " + deducao + " reais.");
      } else {
        System.out.println("Ocorreu um erro na renda.");
      }
    }
  }

  public void obterInfo() {
    System.out.println("--------------------------------------------------------------");
    System.out.println("Nome: " + this.nome);
    System.out.println("Natureza: " + this.natureza);
    System.out.println("Renda bruta: " + this.rendaBruta);
    calcularImposto();
  }

}
