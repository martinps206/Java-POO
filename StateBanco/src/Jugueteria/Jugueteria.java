package Jugueteria;

public abstract class Jugueteria implements Cupon{
    private double precio;

    public Jugueteria(double precio) {
        this.precio = precio;
    }

    public Jugueteria(){

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract String reporte();
}
