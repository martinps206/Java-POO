package NegocioComidas;

public class MenuClasico extends NegocioComidas{

    public MenuClasico(double precioMenu) {
        super(precioMenu);
    }

    @Override
    public double calculoPrecioVenta() {
        return getPrecioMenu();
    }
}
