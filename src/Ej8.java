import java.util.Scanner;

public class Ej8 {
    private static Scanner leer ;
    public static void main(String[] args) {
         leer = new Scanner(System.in);
        int[] vector = new int[10];
        
        // Leer números
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
        
        
        mostrar(vector);
        
        
        int inicial, fin;
        System.out.println();
        do {
            System.out.print("Posición inicial (0-9): ");
            inicial = leer.nextInt();
            System.out.print("Posición final (0-9): ");
            fin = leer.nextInt();
        } while (inicial < 0 || inicial > 9 || fin < 0 || fin > 9 || inicial >= fin);
        
        // Rotar
        int temp = vector[inicial];
        for (int i = inicial; i < fin; i++) {
            vector[i] = vector[i + 1];
        }
        vector[fin] = temp;
        
        
        System.out.println("Resultado:");
        mostrar(vector);
        
    }
    
    public static void mostrar(int[] vector) {
        System.out.print("Indice  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Valor   ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
