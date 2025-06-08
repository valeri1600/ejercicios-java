import java.util.Scanner;

public class Ej10 {
    static Scanner leer = new Scanner(System.in);
    static String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    
    public static void main(String[] args) {
        String[] palabras = new String[8];
        String[] resultado = new String[8];
        int pos = 0;
        
        System.out.println("Escribe 8 palabras:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Palabra " + (i + 1) + ": ");
            palabras[i] = leer.nextLine().toLowerCase();
        }
        
        
        for (int i = 0; i < 8; i++) {
            if (esColor(palabras[i])) {
                resultado[pos++] = palabras[i];
            }
        }
        
        
        for (int i = 0; i < 8; i++) {
            if (!esColor(palabras[i])) {
                resultado[pos++] = palabras[i];
            }
        }
        
        
        System.out.println("Palabras organizadas (colores primero) :");
        for (String palabra : resultado) {
            System.out.print(palabra + " ");
        }
        System.out.println();
    }
    
    static boolean esColor(String palabra) {
        for (int i = 0; i < colores.length; i++) {
            if (palabra.equals(colores[i])) return true;
        }
        return false;
    }
}
