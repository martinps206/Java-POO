package CarritoCompras;

public class Cargando implements StateCarrito{

    private Carrito carrito;

    public Cargando(Carrito carrito){
        this.carrito = carrito;

    }

    @Override
    public void cambiarEstado() {
        carrito.setEstado(new Pagando(carrito));

    }

    public String mostrarEstado (){
        return "Cargando";
    }
}
