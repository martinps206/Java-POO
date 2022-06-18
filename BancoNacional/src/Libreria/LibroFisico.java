package Libreria;

public class LibroFisico extends Libro implements  Delivery{

    public LibroFisico(String tiutlo, String codigo, double precioLista, double precioPromocion, Usuario usuario) {
        super(tiutlo, codigo, precioLista, precioPromocion, usuario);
    }

    public double precioFinal(){
        return getPrecioLista() * (1 - getPrecioPromocion()/100);
    }

    public boolean enviarDomicilio(){
        return true;
    }
}
