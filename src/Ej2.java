import java.util.Scanner;

public class Ej2{
static Scanner leer = new Scanner(System.in);
    
    
    
    public static void leerNumeros(int[] vector) {
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i+1) + ": ");
            vector[i] = leer.nextInt();
        }
    }
    
    public static int encontrarMaximo(int[] vector) {
        int maximo = vector[0];
        for (int i = 1; i < 10; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }
    
    public static int encontrarMinimo(int[] vector) {
        int minimo = vector[0];
        for (int i = 1; i < 10; i++) {
            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }
        return minimo;
    }
    
    public static void mostrarResultados(int[] vector) {
        int maximo = encontrarMaximo(vector);
        int minimo = encontrarMinimo(vector);
        
        System.out.println("\nNúmeros introducidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i]);
            if (vector[i] == maximo) {
                System.out.print(" máximo");
            }
            if (vector[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] vector = new int[10];
        leerNumeros(vector);
        mostrarResultados(vector);
       
    }
}
