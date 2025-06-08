import java.util.Scanner;

public class Ej7{
    private static Scanner leer = new Scanner(System.in);

   
    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void reorganizarPrimos(int[] vector) {
        int[] temp = new int[10];
        int pos = 0;

        for (int i = 0; i < 10; i++) {
            if (esPrimo(vector[i])) {
                temp[pos] = vector[i];
                pos++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (!esPrimo(vector[i])) {
                temp[pos] = vector[i];
                pos++;
            }
        }

        for (int i = 0; i < 10; i++) {
            vector[i] = temp[i];
        }
    }

    public static void ingresarDatos(int[] vector) {
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
    }

    public static void mostrarTabla(int[] vector) {
        System.out.print("Índice: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%4d ", i);
        }

        System.out.println();

        System.out.print("Valor:  ");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%4d ", vector[i]);
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];

        ingresarDatos(numeros);

        System.out.println("Vector original:");
        mostrarTabla(numeros);

        reorganizarPrimos(numeros);

    
        System.out.println("Vector reorganizado (primos primero):");
        mostrarTabla(numeros);
    }
}
