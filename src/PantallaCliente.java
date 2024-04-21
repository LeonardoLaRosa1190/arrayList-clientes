import java.util.Scanner;

public class PantallaCliente  {
    Cliente c = new Cliente();
    Scanner entradaTeclado = new Scanner(System.in);
    public void buclePrincipal(){

        int accion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Consultar Cliente");
            System.out.println("3. Borrar Cliente");
            System.out.println("4. Salir");
            System.out.print("Ingresa una opción: ");


            accion = entradaTeclado.nextInt();

            switch (accion) {
                case 1:
                    c.agregaCliente();
                    break;
                case 2:
                    c.consultarCliente();
                    break;
                case 3:
                    c.borrarCliente();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Elección inválida. Por favor, selecciona una opción válida.");
            }
        } while (accion != 4);
    }
}

