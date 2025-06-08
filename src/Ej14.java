import java.util.Random;

public class Ej14 {
    
    
    public static void llenar(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            vector[i] = random.nextInt(501);
        }
    }
    
    public static void mostrar(int[] vector) {
        System.out.println("Vector original:");
        for (int i = 0; i < 15; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    public static void cincuerizar(int[] vector) {
        for (int i = 0; i < 15; i++) {
            if (vector[i] % 5 != 0) {
                vector[i] = siguiente(vector[i]);
            }
        }
    }
    
    public static int siguiente(int numero) {
        return ((numero / 5) + 1) * 5;
    }
    
    public static void mostrarFinal(int[] vector) {
        System.out.println("Vector cincuerizado:");
        for (int i = 0; i < 15; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] vector = new int[15];
        llenar(vector);
        mostrar(vector);
        cincuerizar(vector);
        mostrarFinal(vector);
    }
}
