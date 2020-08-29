package hardsoftday;

public class Example1 {

    public static void main (String ...args) {

        int edad = 65;

        if (edad <= 18) {
            if (edad < 18) {
                System.out.println("Eres un niño");
            }
        } else if (edad >= 18){
            if (edad < 65){
                System.out.println("Eres un adulto");
            }
        } if (edad >= 65) {
            System.out.println("Eres un viejo");
        } else {
            System.out.println("Digite una edad correcta");
        }

        System.out.println("Proceso terminado!");


    }
}
