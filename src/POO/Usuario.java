package POO;

public class Usuario {

    // Atributos de propiedades
    String id;
    String name;
    String lastName;
    String password;
    String email;
    String photo;


    // Metodos
    public boolean paymet(String id, int pago) {
        this.id = id;

        return true;
    }

    public boolean resetPassword (String nueva, String vieja){
        if (this.password.equals(vieja)) {
            this.password = nueva;
        }

        return true;
    }
}


