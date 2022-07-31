package CarritoCompras;

import java.util.ArrayList;

public class Carrito {
    private StateCarrito estado;
    private ArrayList<Producto> producto = new ArrayList<>();

    public Carrito(){
//        estado = new Vacio();
        setEstado(new Vacio(this));
    }

    public StateCarrito getEstado(){
        return estado;
    }

    public void setEstado(StateCarrito estado){
        this.estado = estado;

    }

    public void addProducto(Producto p){
        if (this.estado.mostrarEstado().equalsIgnoreCase("Pagando") || this.estado.mostrarEstado().equalsIgnoreCase("Cerrado")){
            System.out.println("Operacion no valida");
        } else{
            producto.add(p);
            setEstado(new Cargando(this));
        }
    }

    public void vaciarCarrito(){
        if(!this.estado.mostrarEstado().equalsIgnoreCase("Vacio")){
            setEstado(new Vacio(this));
        } else System.out.println("El Carro se encuentra vacio");
    }

    public void pagarCarrito(){
        if (this.estado.mostrarEstado().equalsIgnoreCase("Vacio") ||
                this.estado.mostrarEstado().equalsIgnoreCase("Pagando") ||
                this.estado.mostrarEstado().equalsIgnoreCase("Cerrado"))  {
            System.out.println("Operacion de pago no valida");

        } else {
            setEstado(new Pagando(this));
        }
    }

    public void cancelarPago(){
        if (this.estado.mostrarEstado().equalsIgnoreCase("Pagando")){
            setEstado(new Cargando(this));
        }
    }

    public void cerrarCarrito(){
        if (this.estado.mostrarEstado().equalsIgnoreCase("Pagando")){
            setEstado(new Cerrado(this));
        } else if (this.estado.mostrarEstado().equalsIgnoreCase("Cerrado")) {
            System.out.println("El carrito ya se encuentra cerrado");

        } else System.out.println("Operacion no valida");
    }



}
