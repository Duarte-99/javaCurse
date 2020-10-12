package hardsoftday;

import java.util.Scanner;

public class Suma2 {

    public static void main (String ...args) {
        Scanner scanner = new Scanner(System.in);


        int num1;
        int num2;

        System.out.println("Ingrese el primer numero");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = scanner.nextInt();

        int suma = num1 + num2 ;
        int resta = num1 - num2 ;
        int division = num1 / num2 ;
        int multiplicacion = num1 + num2 ;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La division de los numeros es: " + division);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);

    }

}
