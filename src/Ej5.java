import java.util.Scanner;

public class Ej5 {
    static Scanner leer = new Scanner(System.in);
    
   
    
    public static void pedir(int[] vector) {
        System.out.println("Introduce 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Número " + (i+1) + ": ");
            vector[i] = leer.nextInt();
        }
    }
    
    public static void mostrar(int[] vector) {
        System.out.println("Resultados:");
        for (int i = 0; i < 8; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println(vector[i] + " par");
            } else {
                System.out.println(vector[i] + " impar");
            }
        }
    }
     public static void main(String[] args) {
        int[] vector = new int[8];
        pedir(vector);
        mostrar(vector);
    }
}
