public class Cuenta {
    private int nroCuenta;
    private double montoInicial;
    private String descripcion;
    private static int id = 1;
    public Cuenta(){
        this.nroCuenta = generarNroCuenta();
    }
    public Cuenta(int montoInicial, String descripcion) {
        this.montoInicial = montoInicial;
        this.descripcion = descripcion;
        this.nroCuenta = generarNroCuenta();
    }
    private int generarNroCuenta() {
        int nroGenerado = id;
        id++;
        return nroGenerado;
    }
    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getMontoInicial() {
        return montoInicial;
    }
    public void setMontoInicial(int montoInicial) {
        this.montoInicial = montoInicial;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return ("El numero de cuenta es: "+this.nroCuenta + " "
                + "- El monto inicial es: $"+this.montoInicial + " "
                 + "- Descripcion: "+this.descripcion);
    }
}
