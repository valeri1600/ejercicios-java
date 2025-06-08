import java.util.Scanner;

public class Ej19 {
    
    static Scanner leer = new Scanner(System.in);

    public static void leerNumeros(int[] vector) {
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
    }

    public static void moverCerosAlFinal(int[] vector) {
        int[] resultado = new int[vector.length];
        int indice = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 0) {
                resultado[indice] = vector[i];
                indice++;
            }
        }

        for (int i = 0; i < vector.length; i++) {
            vector[i] = resultado[i];
        }
    }

    public static void mostrarVector(int[] vector) {
        System.out.print("Vector reorganizado: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] vector = new int[10];

        leerNumeros(vector);
        moverCerosAlFinal(vector);
        mostrarVector(vector);
    }
}
