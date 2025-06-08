import java.util.Random;

public class Ej6 {
    
    public static void llenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(101); 
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static int[] separarParesImpares(int[] original) {
        int[] nuevo = new int[original.length];
        int indice = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 == 0) {
                nuevo[indice] = original[i];
                indice++;
            }
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 != 0) {
                nuevo[indice] = original[i];
                indice++;
            }
        }

        return nuevo;
    }

    public static void mostrarResumen(int[] vector) {
        int pares = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                pares++;
            }
        }

        int impares = vector.length - pares;

        System.out.println("Cantidad  números pares: " + pares);
        System.out.println("Cantidad números impares: " + impares);
    }

     public static void main(String[] args) {
        int[] vector = new int[20];

        llenarVector(vector);

        System.out.println("Números generados:");
        mostrarVector(vector);

        int[] reorganizado = separarParesImpares(vector);

        System.out.println("Vector reorganizado (pares primero, luego impares):");
        mostrarVector(reorganizado);

        mostrarResumen(reorganizado);
    }

}
