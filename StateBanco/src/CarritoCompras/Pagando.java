package CarritoCompras;

import Banco.Persona;

public class Pagando implements StateCarrito{
    private Carrito carrito;
    public Pagando(Carrito carrito){
        this.carrito = carrito;

    }

    @Override
    public void cambiarEstado() {
        carrito.setEstado(new Cerrado(carrito));

    }
    public String mostrarEstado (){
        return "Pagando";
    }
}
