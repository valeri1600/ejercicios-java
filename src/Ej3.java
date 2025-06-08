import java.util.Scanner;

public class Ej3{
    
    private static Scanner leer;

    public static void leerNumeros(int[] vector) {
        leer= new Scanner(System.in);
        System.out.println("Introduce 15 números:");

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
    }
    
    public static void rotarDerecha(int[] vector) {
        int ultimo = vector[vector.length - 1];
        
        for (int i = vector.length - 1; i > 0; i--) {
            vector[i] = vector[i - 1];
        }

        vector[0] = ultimo;
    }
    
    public static void mostrarVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i <vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length-1 ) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] numeros = new int[15];
        
        leerNumeros(numeros);
        
       
        System.out.println("Original:");
        mostrarVector(numeros);
        
        
        rotarDerecha(numeros);
        
        
        System.out.println("Después de la rotación:");
        mostrarVector(numeros);
        
    }
}
