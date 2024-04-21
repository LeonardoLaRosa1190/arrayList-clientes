import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

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
    public void agregaCliente(){
        System.out.println("Ingrese el Nombre del Cliente:");
        this.nombre = entradaArgumento.nextLine();
        System.out.println("Ingrese el Apellido del Cliente:");
        this.apellido = entradaArgumento.nextLine();
        System.out.println("Ingrese el Email del Cliente:");
        this.email = entradaArgumento.nextLine();
        arregloCliente.add(new Cliente (nombre,apellido,email));
        System.out.println("Cliente ingresado con éxito!!");
    }
    public void consultarCliente(){
        System.out.println("Ingrese el Apellido del cliente que desea buscar");
        for (Cliente c: arregloCliente){
            if {
                System.out.println("El nombre ingresado está en el sistema");
            }else {
                System.out.println("El nombre ingresado no está en el sistema");
            }
        }

    }
    public void borrarCliente(){
        System.out.println("Ingrese el Nombre del cliente que desea buscar");
        this.nombre = entradaArgumento.nextLine();
        System.out.println("Ingrese el Apellido");
        this.apellido = entradaArgumento.nextLine();
        System.out.println("Ingrese el Email");
        this.email = entradaArgumento.nextLine();
        arregloCliente.add(new Cliente (nombre,apellido,email));
    }

}
