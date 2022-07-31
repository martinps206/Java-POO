package Jugueteria;

public class JuegoDeMesa extends Jugueteria{
    private String nombre;
    private int cantidadJugMin;
    private int cantidadJugMax;

    public JuegoDeMesa(double precio, String nombre, int cantidadJugMin, int cantidadJugMax) {
        super(precio);
        this.nombre = nombre;
        this.cantidadJugMin = cantidadJugMin;
        this.cantidadJugMax = cantidadJugMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadJugMin() {
        return cantidadJugMin;
    }

    public void setCantidadJugMin(int cantidadJugMin) {
        this.cantidadJugMin = cantidadJugMin;
    }

    public int getCantidadJugMax() {
        return cantidadJugMax;
    }

    public void setCantidadJugMax(int cantidadJugMax) {
        this.cantidadJugMax = cantidadJugMax;
    }

    @Override
    public String reporte(){
        return  "";
    }

    @Override
    public double aplicarCupon(String cupon) {
        return 0;
    }
}
