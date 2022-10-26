package NegocioComidas;

public abstract class NegocioComidas {
    private double precioMenu;

    public NegocioComidas(double precioMenu) {
        this.precioMenu = precioMenu;
    }

    public void prepararMenu(){
        armado();
        calculoPrecioVenta();
    }

    private void armado(){
        System.out.println("El armado del menu es ...");

    }

    abstract double calculoPrecioVenta();

    public double getPrecioMenu() {
        return precioMenu;
    }

    public void setPrecioMenu(double precioMenu) {
        this.precioMenu = precioMenu;
    }

}
