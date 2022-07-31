package Jugueteria;

public class Juguete extends Jugueteria{
    private String nombre;
    private int edadMin;

    public Juguete(double precio, String nombre, int edadMin) {
        super(precio);
        this.nombre = nombre;
        this.edadMin = edadMin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    @Override
    public String reporte() {
        return null;
    }

    @Override
    public double aplicarCupon(String cupon) {
        return 0;
    }
}
