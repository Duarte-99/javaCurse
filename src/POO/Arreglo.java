package hardsoftday;

public class Arreglo {

    public static void main(String[] args) {

        /**
         * @Arreglos
         */

        /**
         * 1. Tamaños fijos
         * 2. Sólo puede contener elementos de un mismo tipo.
         * Puede almacenar tipos de datos primitivos o referencias a objetos
         */

        //Concepto base:
        // Posicion / indice
        // Los indice en los arreglos comienzan con 0

        //{5,10,11,15,12} // arreglo de 5 valores con 5 indice
        //(0, 5)
        //(1, 10)
        //(2, 11)
        //(3, 15)
        //(4, 12)

        //Declaracion arreglos en java

//           int numeros [];
//           numeros =  new int [5];


        /*
        int a[] = new int[3];

        a[0] = 19;
        a[1] = 20;
        a[2] = 25;
        a[3] = 35;
        a[4] = 45;
        a[5] = 65;

        //Obtener los valores
        int x = a[0];
        System.out.println(x);
        System.out.println(a[0]);

         */

        int a[] = new int[5];

        a[0] = 19;
        a[1] = 20;
        a[2] = 25;
        a[3] = 35;
        a[4] = 45;

        //Mostrar los valores por consola

        for (int v : a){
            System.out.println(v);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}