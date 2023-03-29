public class Ejercicio1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        int resultado = sumar(a, b, c);

        System.out.println("El resultado de la suma es " + resultado);

    }
    public static int sumar(int a, int b, int c) {
        int resultado = a + b + c;
        return resultado;
    }
}