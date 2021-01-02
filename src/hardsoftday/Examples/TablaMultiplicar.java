package hardsoftday.Examples;

import java.util.Scanner;

public class TablaMultiplicar {
    
    public static void main (String ...args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese el mumero de la tabla que quiere ver");
        numero = scanner.nextInt();

        for(int i = 0; i < 10; i++){
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
        System.out.println();

    }

}