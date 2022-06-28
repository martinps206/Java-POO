package EmpresaTren;

import java.util.ArrayList;

public class Reserva {
    private String codigo;
    private Recorrido recorrido;
    private int cantPersonas;




    public Reserva(String codigo, Recorrido recorrido, int cantPersonas) throws Exception {
        if (recorrido == null) throw new Exception("Ingrese el recorrido.");
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonas = cantPersonas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double precioPorReserva(){
        if (this.getRecorrido().getEstacionDestino().equalsIgnoreCase("Buenos Aires")
                && this.getRecorrido().getEstacionPartida().equalsIgnoreCase("Bragado"))
            return this.cantPersonas * 50 * 0.8;
        return this.cantPersonas * 50;
    }

    @Override
    public String toString() {
        return "\nCodigo = '" + codigo + '\'' + "\n" +
                recorrido.toString() + "\n" +
                "cantPersonas = "  + cantPersonas + "\n";
    }
}
