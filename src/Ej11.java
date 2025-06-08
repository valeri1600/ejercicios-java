import java.util.Random;
import java.util.Scanner;

public class Ej11{
    static Scanner leer = new Scanner(System.in);

    static void llenarVector(int[] vector) {
        Random aleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(401);
        }
    }
    
    static int pedirOpcion() {
        int opcion;
        do {
            System.out.println("¿Resaltar múltiplos de 5 o 7? Escribe 5 o 7: ");
            opcion = leer.nextInt();
        } while (opcion != 5 && opcion != 7);
        return opcion;
    }
    
    static void mostrarVector(int[] vector, int multiplo) {
        if (multiplo == 0) {
            System.out.println("Números generados:");
        }
        
        for (int i = 0; i < vector.length; i++) {
            if (multiplo > 0 && vector[i] % multiplo == 0) {
                System.out.print("[" + vector[i] + "] ");
            } else {
                System.out.print(vector[i] + " ");
            }
        }
        System.out.println();
    }

     public static void main(String[] args) {
        int[] numeros = new int[20];
       int opcion ;
        llenarVector(numeros);
        mostrarVector(numeros, 0);
        
        opcion = pedirOpcion();
        
        System.out.println("Números con múltiplos de " + opcion + " resaltados:");
        mostrarVector(numeros, opcion);
        

    }
}
