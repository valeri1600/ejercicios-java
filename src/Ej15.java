import java.util.Scanner;

public class Ej15 {
    static Scanner leer = new Scanner(System.in);

    public static void leerVector(int[] vector) {
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
    }

    public static void ordenarAscendente(int[] vector, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            for (int j = i + 1; j <= fin; j++) {
                if (vector[i] > vector[j]) {
                    int temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
        }
    }

    public static void ordenarDescendente(int[] vector, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            for (int j = i + 1; j <= fin; j++) {
                if (vector[i] < vector[j]) {
                    int temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
        }
    }

    public static void mostrarVector(int[] vector) {
        System.out.println("Vector resultante:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] vector = new int[10];

        leerVector(vector);

        ordenarAscendente(vector, 0, 4);

        ordenarDescendente(vector, 5, 9);

     
        mostrarVector(vector);
    }
}
