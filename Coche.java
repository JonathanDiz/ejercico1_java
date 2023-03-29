public class Coche {
    private int numPuertas;

    public Coche() {
        numPuertas = 0;
    }

    public void agregarPuerta() {
        numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}
