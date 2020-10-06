package hardsoftday;

public class Burbuja {

    public static void main (String ...args){

        //Declaracion del arreglo
        int a[] =  new int[10];

        //Poblacion del arreglo con numero aleatorios
        for (int  i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 99); // Genera un numero entre 0.0 y 0.9999999
        }

        //Mostrar por consola
        for (int v : a) {
            System.out.print(v);
        }

        //Ordenar por el método burbuja
        // 1. Recorrer el arreglo tantas veces como elementos contenga menos 1
        // Si el arreglo tiene 10 elementos, voy a recorrerlo 9 veces
        //2. En cada recorrido compara el elemento actual con el elemento sigueiente para saber si estan ordenados,
        // si no lo estan, entonces los ordeno

        // 5, 6, 9, 1, 14, 12,  Original
        // 5, 6, 1, 9, 12, 14    1. Primera pasada
        // 5, 1, 6, 9, 12, 14    2. Segunda pasada
        // 1, 5, 6, 8, 12, 14    3. Tercera pasada

        // Código
        System.out.println("");

        for (int recorrido = 0; recorrido < a.length - 1; recorrido++) {
            for (int elemento = 0; elemento <a.length - 1; elemento++) {
                if (a[elemento] > a[elemento +1 ]) {
                    int t = a[elemento];
                    a[elemento] = a[elemento + 1];
                    a[elemento + 1] = t;
                }
            }
        }

        //Mostramos el arreglo ya ordenado
        for (int v : a ) {
            System.out.print(v + " ");
        }

        System.out.println("");
    }

}
