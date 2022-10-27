public class Cilindro extends Figura3D{

  private int altura;
  private double raio;

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    double areaBase = Math.pow(this.raio, 2) * Math.PI;
    double areaLateral = 2 * Math.PI * this.raio * this.altura ;
    return (2 * areaBase + areaLateral) ;
  }

  @Override
  public double calcularVolume() {
    return (Math.PI * this.altura * Math.pow(this.raio, 2));
  }
}
