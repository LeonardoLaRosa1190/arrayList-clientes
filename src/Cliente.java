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
    Scanner entradaArgumento = new Scanner(System.in);
    Cliente (){};
    Cliente (String nombre,String apellido,String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    public void agregaClientes(){
        System.out.println("Ingrese el Nombre del Cliente:");
        this.nombre = entradaArgumento.nextLine();
        System.out.println("Ingrese el Apellido del Cliente:");
        this.apellido = entradaArgumento.nextLine();
        System.out.println("Ingrese el Email del Cliente:");
        this.email = entradaArgumento.nextLine();
        arregloCliente.add(new Cliente (nombre,apellido,email));
        System.out.println("Cliente ingresado con éxito!!");
    }
    public void mostrarClientes(){;
        for(Cliente c : arregloCliente) {
            System.out.println("El Nombre del Cliente es: " + c.getNombre() + "\n"
                    + "El Apellido del Cliente es: " + c.getApellido() + "\n"
                    + "El email del Cliente es: " + c.getEmail());
        }
    }
    public void borrarClientes(){
        System.out.println("Ingrese el Nombre del cliente que desea buscar");
        this.nombre = entradaArgumento.nextLine();
        System.out.println("Ingrese el Apellido");
        this.apellido = entradaArgumento.nextLine();
        System.out.println("Ingrese el Email");
        this.email = entradaArgumento.nextLine();
        arregloCliente.add(new Cliente (nombre,apellido,email));
    }

}
