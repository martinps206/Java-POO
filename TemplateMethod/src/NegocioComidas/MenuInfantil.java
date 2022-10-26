package NegocioComidas;

public class MenuInfantil extends NegocioComidas{

    private int cantJuguete;

    public MenuInfantil(double precioMenu, int cantJuguete) {
        super(precioMenu);
        this.cantJuguete = cantJuguete;
    }

    @Override
    public double calculoPrecioVenta() {
        return (this.cantJuguete * 3) + getPrecioMenu();
    }
}
