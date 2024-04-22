import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    private String nombre;
    private String apellido;
    private String email;
    ArrayList<Cliente> arregloCliente = new ArrayList<>();

    Cliente (){};
    Cliente (String nombre,String apellido,String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }


}
