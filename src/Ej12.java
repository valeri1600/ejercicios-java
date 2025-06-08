import java.util.Random;
import java.util.Scanner;

public class Ej12 {
     static Scanner leer = new Scanner(System.in);
    
    
    static void generarNumeros(int[] vector) {
        Random aleatorio = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(201); 
        }
    }
    
    static void mostrarVector(int[] vector) {
        System.out.print("Indice: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(i+"  ");
        }
        System.out.println( );
        System.out.print("Valor  ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+"  ");
        }
    }
    
    static int[] alternarNumeros(int[] vector) {
        
        int[] menores = new int[10];
        int[] mayores = new int[10];
        int contMenores = 0;
        int contMayores = 0;
        int[] resultado = new int[10];
        int posMenores = 0;
        int posMayores = 0;
        boolean turnoMenor = true;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] <= 100) {
                menores[contMenores] = vector[i];
                contMenores++;
            } else {
                mayores[contMayores] = vector[i];
                contMayores++;
            }
        }

        
        for (int i = 0; i < 10; i++) {
            if (turnoMenor) { 
                if (posMenores < contMenores) {
                    resultado[i] = menores[posMenores];
                    posMenores++;
                    turnoMenor = false; 
                } else {
                    
                    resultado[i] = mayores[posMayores];
                    posMayores++;
                }
            } else { 
                if (posMayores < contMayores) {
                    resultado[i] = mayores[posMayores];
                    posMayores++;
                    turnoMenor = true;
                } else {
                    
                    resultado[i] = menores[posMenores];
                    posMenores++;
                }
            }
        }
        
        
        return resultado;
    }
    
    public static void main(String[] args) {
        int[] vector = new int[10];
        
        generarNumeros(vector);
        System.out.println("Vector original:");
        mostrarVector(vector);
        System.out.println( );
        
        int[] resultado = alternarNumeros(vector);
        
        System.out.println("Vector alternado (menor-mayor-menor-mayor):");
        mostrarVector(resultado);
        
        
    }
}
