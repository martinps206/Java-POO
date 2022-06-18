package Libreria;

public abstract class Libro {
    private String tiutlo;
    private String codigo;
    private double precioLista;
    private double precioPromocion;
    private Usuario usuario;

    public Libro(String tiutlo, String codigo, double precioLista, double precioPromocion, Usuario usuario) {
        this.tiutlo = tiutlo;
        this.codigo = codigo;
        this.precioLista = precioLista;
        this.precioPromocion = precioPromocion;
        this.usuario = usuario;
    }

    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public double getPrecioPromocion() {
        return precioPromocion;
    }

    public void setPrecioPromocion(double precioPromocion) {
        this.precioPromocion = precioPromocion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public abstract double precioFinal();
}
