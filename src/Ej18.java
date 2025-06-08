import java.util.Scanner;

public class Ej18 {
    static Scanner leer = new Scanner(System.in);
    public static void leerVector(int[] vector) {
       
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
    }

    public static int sumaAlternada(int[] vector) {
        int resultado = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                resultado += vector[i];
            } else {
                resultado -= vector[i];
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] vector = new int[10];

        leerVector(vector);
        int resultado = sumaAlternada(vector);
        System.out.println("Resultado de la suma alternada: " + resultado);
    }
}
