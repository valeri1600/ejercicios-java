import java.util.Scanner;

public class Ej17 {
    public static Scanner leer = new Scanner(System.in);

    public static void leerVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = leer.nextInt();
        }
    }

    public static boolean existeEnVector(int[] vector, int longitud, int valor) {
        for (int i = 0; i < longitud; i++) {
            if (vector[i] == valor) {
                return true;
            }
        }
        return false;
    }

    
    public static int obtenerInterseccion(int[] v1, int[] v2, int[] interseccion) {
        int contador = 0;
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    if (!existeEnVector(interseccion, contador, v1[i])) {
                        interseccion[contador] = v1[i];
                        contador++;
                    }
                    break;
                }
            }
        }
        return contador;
    }

    public static void mostrarVector(int[] vector, int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        int[] interseccion = new int[10];

        System.out.println("Ingrese los 10 elementos del primer vector:");
        leerVector(vector1);

        System.out.println("Ingrese los 10 elementos del segundo vector:");
        leerVector(vector2);
        int cantidad = obtenerInterseccion(vector1, vector2, interseccion);

        System.out.println("Elementos comunes sin repetir:");
        mostrarVector(interseccion, cantidad);
    }
}
