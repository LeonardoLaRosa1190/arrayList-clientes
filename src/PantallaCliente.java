import java.util.Scanner;

public class PantallaCliente  {
    public static void buclePrincipal(){
        ClienteFuncionalidad c = new ClienteFuncionalidad();
        Scanner entradaTeclado = new Scanner(System.in);
        int accion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Consultar lista de Clientes");
            System.out.println("3. Borrar Cliente");
            System.out.println("4. Modificar cuentas");
            System.out.println("5. Salir");
            System.out.print("Ingresa una opción: ");


            accion = entradaTeclado.nextInt();

            switch (accion) {
                case 1:
                    c.agregaClientes();
                    break;
                case 2:
                    c.mostrarClientes();
                    break;
                case 3:
                    c.borrarClientes();
                    break;
                case 4:
                    c.modificarCuenta();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Elección inválida. Por favor, elegí una opción válida.");
            }
        } while (accion != 5);
    }
}

