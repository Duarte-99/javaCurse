package hardsoftday;

import java.util.Scanner;

public class TablaWhile {
    
    public static void main (String ...args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int tabla = 0;

        System.out.println("Ingrese el numero para hacer a tabla");
        numero = scanner.nextInt();

        while(tabla<=10){
            System.out.println(numero + " X " + tabla + " = " + numero * tabla);
            tabla++;
        }


    }

}