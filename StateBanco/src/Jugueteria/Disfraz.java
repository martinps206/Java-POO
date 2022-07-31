package Jugueteria;

public class Disfraz extends Jugueteria{
    private String descripcioin;
    private String talle;

    public Disfraz(double precio, String descripcioin, String talle) {
        super(precio);
        this.descripcioin = descripcioin;
        this.talle = talle;
    }

    public String getDescripcioin() {
        return descripcioin;
    }

    public void setDescripcioin(String descripcioin) {
        this.descripcioin = descripcioin;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }


    @Override
    public double aplicarCupon(String cupon) {
        return 0;
    }

    @Override
    public String reporte() {
        return null;
    }
}
