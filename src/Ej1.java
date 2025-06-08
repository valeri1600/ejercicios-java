import java.util.Random;

public class Ej1{
    private static int[] cuadrado = new int[20];
    private static  int[] cubo = new int[20];
    public static void numeroAleatorio(int[] vector){
        Random aleatorio = new Random();
        for (int i = 0; i < 20; i++) {
            vector[i] = aleatorio.nextInt(101); 
            cuadrado[i] = vector[i] * vector[i];
            cubo[i] = vector[i] * vector[i] * vector[i];
        }
    }

    public static void Imprimir(int[]vector){
        System.out.print("\n"+ "Número   "+ "Cuadrado  "+ "Cubo");
        for (int i = 0; i < 20; i++) {
            System.out.print("\n   "+ vector[i]+"     "+cuadrado[i]+"       "+ cubo[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        int[] numero = new int[20];
       
                
        numeroAleatorio(numero);
        Imprimir(numero);
    }
}
