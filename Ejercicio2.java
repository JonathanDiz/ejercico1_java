public class Ejercicio2 {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();

        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puerta(s).");
    }
}