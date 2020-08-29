package hardsoftday;

import java.util.Scanner;

public class Nombre {

    public static void main(String ...args) {

        Scanner scanner = new Scanner(System.in);

        int edad;
        String nombre;

        System.out.println("Ingrese su Nombre");
        nombre = scanner.next();

        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();

        System.out.println("Su nombre es " + nombre + " con edad de " + edad);

    }
}
