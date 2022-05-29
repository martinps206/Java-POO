package BandaMusical;

public class Cancion {
    private String nombreCancion;
    private int duracion;

    public Cancion(String nombreCancion, int duracion) {
        this.nombreCancion = nombreCancion;
        this.duracion = duracion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
}
