public class Main {
    public static void main(String[] args) {

        Carro a = new Carro("Fiat", "Uno", 5, 50, 12);

        a.exibirAutonomia();
        System.out.println("O método obter autonomia foi acionado: " + a.obterAutonomia());
        System.out.println("O consumo de combustivel é: " + a.calculaCombustivel(50));
    }
}