import java.util.Scanner;

public class Ej16 {
    private static Scanner leer = new Scanner(System.in);

   

    public static void leerVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
    }

    public static int []eliminarNegativos(int[] vector) {
        int conteo = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= 0) {
                conteo++;
            }
        }

        int[] sinNegativos = new int[conteo];
        int j = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= 0) {
                sinNegativos[j] = vector[i];
                j++;
            }
        }

        return sinNegativos;
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];

        
        leerVector(vector);

        
        int[] vectorCompacto = eliminarNegativos(vector);

      
        System.out.println("Vector sin negativos:");
        mostrarVector(vectorCompacto);
    }
}
