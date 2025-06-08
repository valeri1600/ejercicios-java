import java.util.Scanner;

public class Ej20 {
   
    static Scanner leer = new Scanner(System.in);
    public static void leerVector(int[] vector) {
        
        System.out.println("Ingrese 15 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
    }

    public static void reemplazarMultiplosDeTres(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 3 == 0) {
                vector[i] = -1;
            }
        }
    }

    public static void mostrarVector(int[] vector) {
        System.out.print("Vector resultante: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
        int[] vector = new int[15];
        
        leerVector(vector);
        reemplazarMultiplosDeTres(vector);
        mostrarVector(vector);
    }
}
