
import java.util.Scanner;

public class Comparacionnumeros {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numero3;
        try ( //Se crea un scanner para que ingresen los tres numeros.
                Scanner numeros = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero: ");
            numero1 = numeros.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            numero2 = numeros.nextInt();
            System.out.print("Ingrese el tercer numero: ");
            numero3 = numeros.nextInt();
            //Se cierra el scanner.
        }

        //Se usa el boolean.
        Boolean resultado = numero1 > numero2 && numero1 < numero3 ;

        //Se usa el condicional if para determinar el valor de los numeros.
        if (numero1>numero2) {
            if (numero1<numero3) {
             System.out.println("Primer numero " + numero1 + " es mayor que el segundo numero " + numero2 + " y  menor que el tercer numero " + numero3 + ". El resultado es: " + resultado );
            }
            else {
                System.out.println("Primer numero " + numero1 + " es mayor que el segundo numero " + numero2 + " y  menor que el tercer numero " + numero3 + ". El resultado es: " + resultado ); 
            }
        } else {
            System.out.println("Primer numero " + numero1 + " es mayor que el segundo numero " + numero2 + " y  menor que el tercer numero " + numero3 + ". El resultado es: " + resultado );
        }
    }
}
