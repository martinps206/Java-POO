package NegocioComidas;

public class MenuVegetariano extends NegocioComidas{

    private int cantEspecias;
    private int cantSalsaVegetariana;

    public MenuVegetariano(double precioMenu, int cantEspecias, int cantSalsaVegetariana) {
        super(precioMenu);
        this.cantEspecias = cantEspecias;
        this.cantSalsaVegetariana = cantSalsaVegetariana;
    }

    @Override
    public double calculoPrecioVenta() {
        return (this.cantEspecias * 0.01) + (this.cantSalsaVegetariana * 2) + getPrecioMenu();
    }
}
