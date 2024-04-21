import java.util.ArrayList;

public class AccionCliente extends Cliente {

   private ArrayList<Cliente> clienteArray = new ArrayList<>();

   public void agregaClliente (String nombre,String apellido, String email){
    clienteArray.add(new Cliente(nombre,apellido,email));
   }
}
