package BancoNacional;

public class Clientes {
    private int numeroCliente;
    private String apellido;
    private int DNI;
    private int CUIT;

    public Clientes(int numeroCliente, String apellido, int DNI, int CUIT) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }

    public Clientes() {
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public void depositarEfectivo(){

    }

    public void extraerEfectivo(){

    }

    public void cobrarInteres(){

    }

    @Override
    public String toString() {
        return "Clientes{" +
                "numeroCliente=" + numeroCliente +
                ", apellido='" + apellido + '\'' +
                ", DNI=" + DNI +
                ", CUIT=" + CUIT +
                '}';
    }
}
