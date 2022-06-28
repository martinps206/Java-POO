package EmpresaTren;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Reserva> reserva = new ArrayList<>();

    private ArrayList<String> estacionesActuales(){
        ArrayList<String> estaciones = new ArrayList<String>();
        estaciones.add("Buenos Aires");
        estaciones.add("Lujan");
        estaciones.add("Mercedes");
        estaciones.add("Suipacha");
        estaciones.add("Chivilcoy");
        estaciones.add("Alberti");
        estaciones.add("Bragado");
        return estaciones;

    }

    public Empresa(String nombre) throws Exception{
        if (nombre.equals("")) throw new Exception("Ingrese un nombre por favor.");
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }

    public void addReserva(Reserva r) throws Exception{
        if (r == null) throw new Exception("Ingrese una reserva valida.");
        reserva.add(r);
    }

    public double recaudacionTotal(){
        double total = 0;
        for (Reserva r : this.reserva) {
            total += r.precioPorReserva();
        }
        return total;
    }

    private boolean existeEstacion(String estacion){
        for (String e : this.estacionesActuales()) {
            if(e.equalsIgnoreCase(estacion)) return true;
        }
        return false;
    }

    public void cantVecesRecorrida(String estacion) throws Exception{
        if (!existeEstacion(estacion)) throw new Exception("La estacion no existe.");
        int cantPartida = 0;
        int cantDestino = 0;

        for (Reserva r : this.reserva){
            if (estacion.equalsIgnoreCase(r.getRecorrido().getEstacionPartida())) cantPartida+=1;
            if (estacion.equalsIgnoreCase(r.getRecorrido().getEstacionDestino())) cantDestino+=1;
        }

        System.out.println(" --> Cantidad Destino " + cantDestino + " en las que descendieron en " + estacion);
        System.out.println(" --> Cantidad Partida " + cantPartida + " en las que ascendieron en " + estacion);
    }


    @Override
    public String toString() {
        return "Empresa " + nombre + "\n" +
                "Reservas : " + reserva;
    }
}
