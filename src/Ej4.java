import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    static Scanner leer = new Scanner(System.in);

    public static void generarNumerosAleatorios(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(21); 
        }
    }
    
    public static void mostrarNumeros(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    public static int reemplazarYMostrar(int[] vector, int valorBuscar, int valorReemplazo) {
        int contador = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valorBuscar) {
                vector[i] = valorReemplazo;
                System.out.print("\"" + valorReemplazo + "\"");
                contador++;
            } else {
                System.out.print(vector[i]);
            }
            
            if (i < vector.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        return contador;
    }
    public static void main(String[] args) {
        
        int[] numeros = new int[100];
        int valorBuscar,valorReemplazo,cambios;
        
        generarNumerosAleatorios(numeros);
        
        System.out.println("Números aleatorios generados:");
        mostrarNumeros(numeros);
        
        System.out.print("Introduce el valor a buscar: ");
        valorBuscar = leer.nextInt();
        
        System.out.print("Introduce el valor de reemplazo: ");
        valorReemplazo = leer.nextInt();
        
        System.out.println("Resultado después del reemplazo:");
        cambios = reemplazarYMostrar(numeros, valorBuscar, valorReemplazo);
        
        System.out.println("Se realizaron " + cambios + " cambios.");
        
       
    }
    
}
