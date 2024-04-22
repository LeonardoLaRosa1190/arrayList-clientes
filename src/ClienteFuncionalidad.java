import java.util.Scanner;

public class ClienteFuncionalidad  extends Cliente{

    ClienteFuncionalidad(){}
    Scanner EntradaArgumento = new Scanner(System.in);
    public void agregaClientes(){
        System.out.println("Ingrese el Nombre del Cliente:");
        String nombre = EntradaArgumento.nextLine();
        System.out.println("Ingrese el Apellido del Cliente:");
        String apellido = EntradaArgumento.nextLine();
        System.out.println("Ingrese el Email del Cliente:");
        String email = EntradaArgumento.nextLine();
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
