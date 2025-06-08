import java.util.Random;
import java.util.Scanner;

public class Ej13{
    static Scanner leer = new Scanner(System.in);
    static void generarNumeros(int[] vector) {
        Random aleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(201);
        }
    }
    
    static void mostrarVector(int[] vector) {
        System.out.print("Índice: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        
        System.out.print("Valor:  ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "\t");
        }
        System.out.println();
    }
    
    static int pedirNumero() {
        System.out.println("¿Qué número quieres insertar? ");
        return leer.nextInt();
    }
    
    static int pedirPosicion() {
        int posicion;
        do {
            System.out.println("¿En qué posición lo quieres insertar? (0-11): ");
            posicion = leer.nextInt();
        } while (posicion < 0 || posicion > 11);
        return posicion;
    }
    
    static void insertarNumero(int[] vector, int numero, int posicion) {
        for (int i = vector.length - 1; i > posicion; i--) {
            vector[i] = vector[i - 1];
        }
        vector[posicion] = numero;
    }   
       
     public static void main(String[] args) {
        int[] vector = new int[12];
        
        generarNumeros(vector);
        System.out.println("Vector original:");
        mostrarVector(vector);
        
        int numero = pedirNumero();
        int posicion = pedirPosicion();
        
        insertarNumero(vector, numero, posicion);
        
        System.out.println("Vector después de insertar:");
        mostrarVector(vector);
        
        
    }
    
}
