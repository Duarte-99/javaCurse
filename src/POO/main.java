package POO;

public class main {
    public static void main (String ...args) {
        System.out.println("POO con JAVA");

        // Instancia de la clase
        Usuario manuel =  new Usuario("12", "Manuel", "Duarte");
        System.out.println(manuel);

        manuel.paymet("asd", 45);
        System.out.println(manuel);
    }



}

