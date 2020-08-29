package hardsoftday;

public class CircleDoWhile {

    public static void main (String ...args) {

        // do while
        // El código se ejecutará por lo menos una vez

        // do {
        // sentencia
        // } while (condición)
        // break: Detiene el ciclo.
        // continue: No va a ejecutar el código del bloque del ciclo
        // que esté luego de la palabra reservada.

        int i = 0;

        do {
            System.out.println(i);
            i++;

            if (i % 2 == 0 ){
               // break;
//                System.out.println("Soy un numero par: " + i);
                continue;
            }
            System.out.println("Estoy despues del continue:" + i);
        } while (i < 10);

    }

}
