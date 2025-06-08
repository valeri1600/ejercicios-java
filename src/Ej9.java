import java.util.Random;
import java.util.Scanner;

public class Ej9 {
 static Scanner leer = new Scanner(System.in);

   

    public static void llenarVector(int[] vector) {
        Random aleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(1,501); 
        }
    }

    public static void mostrarVector(int[] vector, int destacar) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == destacar) {
                System.out.print("**" + vector[i] + "** ");
            } else {
                System.out.print(vector[i] + " ");
            }
        }
        System.out.println();
    }

    public static int buscarNumero(int[] vector, String tipo) {
        int resultado = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (tipo.equals("max")) {
                if (vector[i] > resultado) {
                    resultado = vector[i];
                }
            } else if (tipo.equals("min")) {
                if (vector[i] < resultado) {
                    resultado = vector[i];
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] vector = new int[100];
        String opcion;
        int numeroDestacado;
        llenarVector(vector);

        System.out.println("Vector generado:");
        mostrarVector(vector, 0);

        System.out.println("¿Quieres destacar el número máximo o mínimo? (max - min): ");
        opcion = leer.nextLine();

        numeroDestacado=buscarNumero(vector, opcion);

        System.out.println("Vector con el número destacado:");
        mostrarVector(vector, numeroDestacado);
    }
}
