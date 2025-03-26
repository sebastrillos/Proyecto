
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ingrese el numero de filas: ");
        int filas = input.nextInt();
        System.out.println("ingrese el numero de columnas: ");
        int columnas = input.nextInt();
        int[][] matriz = new int[filas][columnas];

        System.out.println("ingrese los valores de la matriz:");
        for (int i = 1; i < filas; i++) {
          for (int j = 1; j < columnas; j++) {
              System.out.println("elemento [" + i + "][" + j + "]: ");
              matriz[i][j] = input.nextInt();
          }  
        }
        for (int i = 1; i < filas; i++) {
        for (int j = 1; j < columnas; j++) {
            System.out.println(matriz[i][j] + " ");
        }
            }
     }
}

