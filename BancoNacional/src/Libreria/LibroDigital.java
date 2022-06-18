package Libreria;

public class LibroDigital extends Libro{
    private int numeroTarjeta;
    private int tamanio;


    public LibroDigital(String tiutlo, String codigo, double precioLista, double precioPromocion, Usuario usuario, int numeroTarjeta, int tamanio) {
        super(tiutlo, codigo, precioLista, precioPromocion, usuario);
        this.numeroTarjeta = numeroTarjeta;
        this.tamanio = tamanio;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public double precioFinal(){
        return 0.9 * getPrecioLista() * (1 - getPrecioPromocion()/100);
    }

    public double serComprimido(){
        return this.tamanio * 0.675;
    }

}
