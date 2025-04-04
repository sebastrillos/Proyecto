import java.util.Scanner;

public class MultiMatriz {
    public static void main(String[] args) {
        System.out.println("ingrese dos matrizes a multiplicar");
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese el numero de filas de las matrizes: ");
        int filas = input.nextInt();
        System.out.print("ingrese el numero de columnas de las matrizes: ");
        int columnas = input.nextInt();
        int[][] matriz = new int[filas][columnas];
        int filaMatriz = matriz.length;

        System.out.println("ingrese los valores de la primera matriz; ");
        for (int i = 0; i < filaMatriz; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("ingrese e elemento [" + i + "," + j + "]");
                matriz[i][j] = input.nextInt(); 
            }
        }
        System.out.println("ingrese los valores de la segunda matriz: ");
        for (int q = 0; q < .length; q++) {
            
        }
    }
}
