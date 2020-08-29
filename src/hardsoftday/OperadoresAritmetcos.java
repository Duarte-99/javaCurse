package hardsoftday;

public class OperadoresAritmetcos {

    public static void main (String ...args){
        /**
         * Operadores
         * suma +
         * resta -
         * multiplicacion *
         * division /
         * resto %
         *  Operador . (POO), operador ()-> operdador de agrupacion
         * Jereraquia
         * Primero * / (Con prioridad de izquierda a derecha)
         *
         *      Primero se hacen las multiplicaciones si esta de primero el signo * /
         *      Primero se hacen las divisiones si esta primero que la miltiplicacion / *
         *
         * Segundo + - (Con prioridad de izquierda a derecha)
         */

        int o = 3 + 3 * 3 - 3;

        // int o = (3+3) * 3 - 3 // primero lo que esta entre parentesis el resulatado de ese se suma por el * 3 y duespues ese - 3

        System.out.println(o);


    }

}
