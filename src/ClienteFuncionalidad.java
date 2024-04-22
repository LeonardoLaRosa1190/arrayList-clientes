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
        System.out.println("Cliente ingresado con éxito!!"+"\n");
        System.out.println("Presione enter para continuar");
        EntradaArgumento.nextLine();
    }
    public void mostrarClientes(){;
        for(Cliente c : arregloCliente) {
            System.out.println("El ID del cliente es: "+ c.getIdCliente() + "\n"
                    + "El Nombre del Cliente es: " + c.getNombre() + "\n"
                    + "El Apellido del Cliente es: " + c.getApellido() + "\n"
                    + "El email del Cliente es: " + c.getEmail());
        }
        System.out.println("Presione enter para continuar");
        EntradaArgumento.nextLine();
    }
    public void borrarClientes() {
        System.out.println("Presione: (1 - Si conoce el id del cliente que desea eliminar");
        System.out.println("Presione: (2 - No conoce el id del cliente que desea eliminar");
        int opcion = EntradaArgumento.nextInt();

        switch (opcion) {
            case 1:
                eliminarCliente();
                break;
            case 2:
                mostrarClientes();
                eliminarCliente();
                break;
            default:
                System.out.println("Elección inválida. Por favor, selecciona una opción válida.");
        }
    }
        private void eliminarCliente() {
            System.out.println("Ingrese el id del cliente que desea eliminar");
            int id = EntradaArgumento.nextInt();
            for (Cliente c : arregloCliente) {
                if (c.getIdCliente() == id) {
                    System.out.println("¿Está seguro de que desea eliminar al cliente " + c.getNombre() + " " + c.getApellido() + "? (S/N)");
                    String confirmacion = EntradaArgumento.next().toLowerCase();
                    if (confirmacion.equals("s")) {
                        arregloCliente.remove(c);
                        System.out.println("Cliente eliminado con éxito.");
                    } else {
                        System.out.println("Operación cancelada.");
                    }
                }else{
                    System.out.println("El ID del cliente ingresado no se encuentra.");
                }
            }
        }
}
