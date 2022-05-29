package Composite;

public class Logistica {
    public static void main(String[] args) {
        Thread copiaseguridad = new Thread(new EmpleadoFactor());
        copiaseguridad.start();
        EmpleadoFactor e = new EmpleadoFactor();
    }
}
