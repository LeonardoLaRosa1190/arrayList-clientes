import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private int idCliente;
    private static int id = 1;
    private Cuenta cuenta;
    ArrayList<Cliente> arregloCliente = new ArrayList<>();

    Cliente (){};
    Cliente (String nombre,String apellido,String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.idCliente = generarId();
        this.cuenta = new Cuenta();
    }
    private int generarId() {
        int idGenerado = id;
        id++;
        return idGenerado;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }
    public int getNroCuenta() {
        return this.cuenta.getNroCuenta();
    }
    public void setDatosCuenta(int monto,String descripcion){
        this.cuenta.setDescripcion(descripcion);
        this.cuenta.setMontoInicial(monto);
    }

}
