package hardsoftday;

public class OperadoresLogicos {

    public static void main (String ...args) {
        /**
         * Operadores Logicos
         */

        // Y O
        //Tabla de verdad Y (&&)
        /**
         *      A       B       RESULTADO
         *      TRUE    TRUE    TRUE
         *      TRUE    FLASE   FALSE
         *      FALSE   TRUE    FALSE
         *      FALSE   FALSE   FALSE
         */

       // int edad = 9;
       // boolean ninez = edad <= 11 && edad >= 0;
       // System.out.println(ninez);

        /** TABLA DE VERDAD DE O (||)
         *   TRUE    TRUE    TRUE
         *   RUE     FLASE   TRUE
         *   FALSE   TRUE    TRUE
         *   FALSE   FALSE   FALSE
         */

        int edad = 15;
        boolean ninez = edad <= 11 || edad >= 11;
        System.out.println(ninez);

    }

}
