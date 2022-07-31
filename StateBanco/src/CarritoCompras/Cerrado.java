package CarritoCompras;

import Banco.Persona;

public class Cerrado implements StateCarrito{

    private Carrito carrito;

    public Cerrado(Carrito carrito){
        this.carrito = carrito;

    }

    @Override
    public void cambiarEstado() {

        System.out.println("El carrito esta cerrado");
    }

    public String mostrarEstado (){
        return "Cerrado";
    }
}
