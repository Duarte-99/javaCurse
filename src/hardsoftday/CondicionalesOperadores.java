package hardsoftday;

public class CondicionalesOperadores {

    public static void main (String ...args) {
        //Condicionales se ejecutan con la palabra reservada if

        //if(condicion){
        //  code
        //}

        int edad = 65;

        if (edad >= 0 && edad < 18) {
            System.out.println("Estas en la niñez / adolecencia");
        } else if (edad >= 18 && edad < 65){
            System.out.println("Estas en la Adultez");
        } else if (edad >= 65){
            System.out.println("Estás en la vejez");
        } else {
            System.out.println("Edad Errada");
        }

        System.out.println("Proceso terminado");

        //  OPERADORES CON LAS CONDICIONALES

    }
}
