public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.desligar();
        lampada.mostrarEstadoLampada();

        lampada.mudarEstado();
        lampada.mostrarEstadoLampada();

        lampada.mudarEstado();
        lampada.mostrarEstadoLampada();




    }
}